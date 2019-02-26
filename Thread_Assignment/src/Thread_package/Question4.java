package Thread_package;
//Question 4 Try shutdown() and shutdownNow() and observe the difference.
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Question4 {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
     try{
        executorService.submit(new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread 1");
               
            }
        });
        executorService.submit(new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread 2");
            }
        });
         executorService.submit(new Runnable() {
             @Override
             public void run() {
                 System.out.println("thread 3");
                try{
                    Thread.sleep(1000);
                }  catch (Exception e)
                {
                    System.out.println( e);
                }
                 System.out.println("thread 3 resumed");

             }
         });


    }  finally {
         executorService.shutdown();
         //executorService.shutdownNow();

     }
        System.out.println(executorService.isShutdown());
        System.out.println("terminated "+executorService.isTerminated());
    }


}