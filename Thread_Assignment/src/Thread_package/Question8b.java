package Thread_package;//Question 8b Schedule task using schedule(), scheduleAtFixedRate() and scheduleAtFixedDelay()


import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Question8b {
    public static void main(String[] args) {
        ScheduledExecutorService executorService = Executors.newSingleThreadScheduledExecutor();



        executorService.scheduleWithFixedDelay(new Runnable() {
                                            @Override
                                            public void run() {
                                                try {
                                                    Thread.sleep(3000);
                                                    System.out.println(Thread.currentThread().getName());
                                                    System.out.println("Schedule With Fixed Delay");
                                                } catch (InterruptedException e) {
                                                    System.out.println(e);
                                                }
                                            }
                                        },
                        0,
                        10000,
                        TimeUnit.MILLISECONDS);

        executorService
                .scheduleAtFixedRate(new Runnable() {
                                         @Override
                                         public void run() {
                                             try {
                                                 Thread.sleep(5000);
                                                 System.out.println(Thread.currentThread().getName());
                                                 System.out.println("Schedule At Fixed Rate");
                                             } catch (InterruptedException e) {
                                                 e.printStackTrace();
                                             }
                                         }
                                     }
                        ,
                        0,
                        8000,
                        TimeUnit.MILLISECONDS);
        executorService.shutdown();
        System.out.println(executorService.isShutdown());

    }
}