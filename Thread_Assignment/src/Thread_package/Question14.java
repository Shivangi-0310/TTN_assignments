package Thread_package;
// Question 14 Coordinate multiple threads using wait() and notifyAll().
class Thread1 extends Thread {
    public void run()
    {
        synchronized(this)
        {
            System.out.println
                    ( "thread started: "+Thread.currentThread().getName());
            try {
                this.wait();
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Thread notified: "+Thread.currentThread().getName());
        }
    }
} class Thread2 extends Thread {
    Thread1 thread1;
    Thread2(Thread1 thread1)
    {
        this.thread1 = thread1;
    }
    public void run()
    {
        synchronized(this.thread1)
        {
            System.out.println("thread started: "+Thread.currentThread().getName());

            try {
                this.thread1.wait();
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Thread notified: "+Thread.currentThread().getName());

        }
    }
} class Thread3 extends Thread {
    Thread1 thread1;
    Thread3(Thread1 thread1)
    {
        this.thread1 = thread1;
    }
    public void run()
    {
        synchronized(this.thread1)
        {
            System.out.println( "thread started: "+Thread.currentThread().getName());

            this.thread1.notifyAll();
            System.out.println("Thread notified: "+Thread.currentThread().getName());

        }
    }
}
public class Question14 {
    public static void main(String[] args) throws InterruptedException
    {

        Thread1 thread1 = new Thread1();
        Thread2 thread2 = new Thread2(thread1);
        Thread3 thread3 = new Thread3(thread1);
        Thread t1 = new Thread(thread1, "Thread1");
        Thread t2 = new Thread(thread2, "Thread2");
        Thread t3 = new Thread(thread3, "Thread3");
        t1.start();
        t2.start();
        Thread.sleep(900);
        t3.start();
    }
}
