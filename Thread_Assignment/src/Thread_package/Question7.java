package Thread_package;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Question7 {

    public static void main(String... s) throws InterruptedException {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        executorService.submit(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName());

                try {
                    Thread.sleep(1000);


                } catch (InterruptedException e) {
                    System.out.println(e);
                }
                for (int i = 0; i < 5; i++) {
                    System.out.println("hello");
                }
            }
        });
        executorService.shutdown();
        executorService.awaitTermination(3000, TimeUnit.MILLISECONDS);

        if (executorService.isTerminated()) {
            System.out.println("Task is Terminated");
        } else {
            System.out.println("Tasks remaining");
        }
    }
}