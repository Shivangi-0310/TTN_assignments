package Thread_package;

// Question 1. Create and Run a Thread using Runnable Interface and Thread class.
// Using runnable interface
class ThreadClass implements Runnable{
     public void run(){
         System.out.println("thread is started: " + Thread.currentThread().getName());

    }

}

public class Question1 {
    public static void main(String[] args) {
        Thread t1= new Thread(new ThreadClass());
        t1.start();
        
    }


}
