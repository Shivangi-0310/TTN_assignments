package Thread_package;


import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Question16 {

    Lock lock1 = new ReentrantLock(true);
    Lock lock2 = new ReentrantLock(true);

    public void occupyLock(Lock lock1, Lock lock2) {

        boolean occupyLock1 = lock1.tryLock();
        boolean occupyLock2 = lock2.tryLock();

        if (occupyLock1 && occupyLock2) {
            return;
        }

        if (occupyLock1) {
            lock1.unlock();
        }

        if (occupyLock2) {
            lock2.unlock();
        }

    }

    public void method1() {
        occupyLock(lock1, lock2);
        System.out.println("lock 1 method 1");

        System.out.println("lock 2 method 1");
        lock2.unlock();
        lock1.unlock();
    }

    public void method2() {
        occupyLock(lock2, lock1);
        System.out.println("lock 1 method 2");
        System.out.println("lock 2 method 2");
        lock1.unlock();
        lock2.unlock();
    }

    public static void main(String[] args) throws InterruptedException {
        Question16 demo = new Question16();
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                demo.method1();
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                demo.method2();
            }
        });
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
    }
}