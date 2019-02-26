package Thread_package;
//Question 5 Use isShutDown() and isTerminate() with ExecutorService.
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Question5 {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        try{
            executorService.submit(new Runnable() {
                @Override
                public void run() {
                    System.out.println("Thread-1");

                }
            });
            executorService.submit(new Runnable() {
                @Override
                public void run() {
                    System.out.println("Thread-2");
                    try{
                        Thread.sleep(5000);
                    }  catch (Exception e)
                    {
                        System.out.println( e);
                    }
                    System.out.println("thread 2 resumed");
                }
            });
            executorService.submit(new Runnable() {
                @Override
                public void run() {
                    System.out.println("thread-3");



                }
            });


        }  finally {
            executorService.shutdown();

        }
        System.out.println(executorService.isShutdown());
        System.out.println("terminated "+executorService.isTerminated());
    }


}
