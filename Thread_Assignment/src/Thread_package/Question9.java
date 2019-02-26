package Thread_package;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

// Question 9 Increase concurrency with Thread pools using
// newCachedThreadPool() and newFixedThreadPool().
class Employee implements Runnable{
    int eId;

    Employee(int eid)
    {
        this.eId=eid;

    }
    public void run()
    {
        System.out.println("Thread started : "+Thread.currentThread().getName());
        try{
            Thread.sleep(2000);
        } catch (InterruptedException e)
        {
            System.out.println(e);
        }
        System.out.println("Thread ended: "+Thread.currentThread().getName());
    }
}
public class Question9{
    public static void main(String[] args) {
      ExecutorService executorService= Executors.newFixedThreadPool(4);
             for (int i = 0; i <= 10; i++) {
            executorService.submit(new Employee(i));
        }
        ExecutorService executorService1= Executors.newCachedThreadPool();
        for (int i = 0; i <= 20; i++) {
            executorService1.submit(new Employee(i));
        }


    }
}