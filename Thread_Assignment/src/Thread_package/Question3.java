package Thread_package;
// Question 3 Use a singleThreadExecutor to submit multiple threads.

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Question3 implements Runnable {
    public void run() {
        System.out.println("thread: " + Thread.currentThread().getName());

        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            System.out.println(e);
        }

    }

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Thread myThread = new Thread(new Question3(), "Thread 1");

        Thread myThread1 = new Thread(new Question3(), "Thread 2");
        Thread myThread2 = new Thread(new Question3(), "Thread 3");

            try {
                myThread.start();
                myThread1.start();
                myThread2.start();
                executorService.submit(myThread);
                executorService.submit(myThread1);
                executorService.submit(myThread2);
            }
            finally {
                executorService.shutdownNow();
            }
        System.out.println(executorService.isShutdown());
//        System.out.println(executorService.isTerminated());

    }
}