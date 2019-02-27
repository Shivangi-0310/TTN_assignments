package Thread_package;
 // Question 15 Use Reentract lock for coordinating 2 threads with signal(), signalAll() and wait().
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Question15 {
    Lock lock = new ReentrantLock(true);
    Condition condition = lock.newCondition();

    public void method1() {
        try {
            lock.lock();
            System.out.println("method 1 Started");
            condition.await();
            System.out.println("method 1 Finished");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }

    }

    public void method2() {
        try{
            lock.lock();
            System.out.println("method 2 Started");
            System.out.println("method 2 Finished");
            condition.signal();
        }finally {
            lock.unlock();
        }
    }
    public void method3() {
        try{
            lock.lock();
            System.out.println("method 3 Started");
            System.out.println("method 3 Finished");
            condition.signalAll();
        }finally {
            lock.unlock();
        }
    }
    public static void main(String[] args) throws InterruptedException {
        Question15 question15 = new Question15();
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                question15.method1();
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                question15.method2();
            }
        });
        Thread thread3 = new Thread(new Runnable() {
            @Override
            public void run() {
                question15.method3();
            }
        });
        thread1.start();
        thread2.start();
        thread3.start();
        thread1.join();
        thread2.join();
        thread3.join();
    }
}
