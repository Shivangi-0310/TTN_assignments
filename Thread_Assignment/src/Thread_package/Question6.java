package Thread_package;
import java.util.concurrent.*;

// Question 6 Return a Future from ExecutorService by using callable and use get(),
 // isDone(), isCancelled() with the Future object to know the status of task submitted.
public class Question6 implements Callable<String> {
    public String call() throws InterruptedException
    {
        return "hello";
    }
     public static void main(String[] args) throws ExecutionException,InterruptedException {
         ExecutorService executorService= Executors.newSingleThreadExecutor();
         Callable<String> callable = new Question6();
         Future<String> future= executorService.submit(callable) ;
         executorService.shutdown();
         if(future.isDone()){
             System.out.println(future.get());
         }
         if(future.isCancelled())
         {
             System.out.println("Task is cancelled");
         }


     }
}
