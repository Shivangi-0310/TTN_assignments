package Thread_package;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Question8a {
    public static void main(String[] args) {
        ScheduledExecutorService executorService = Executors.newSingleThreadScheduledExecutor();

        executorService.schedule(new Runnable() {
                                     @Override
                                     public void run() {
                                         System.out.println(Thread.currentThread().getName());
                                         System.out.println("Task executed after 5 millisecond");
                                     }
                                 },
                5000,
                TimeUnit.MILLISECONDS);
    }
}
