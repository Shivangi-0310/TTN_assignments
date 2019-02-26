package Thread_package;

// Question 1. Create and Run a Thread using Runnable Interface and Thread class.
// Using Thread class

class CreateThread extends Thread
{

    public void run()
    {
        System.out.println("Thread is running: "+ Thread.currentThread().getName());
    }
}
public class Question1b {
    public static void main(String[] args) {
        CreateThread t1= new CreateThread();
        t1.start();
        }

}
