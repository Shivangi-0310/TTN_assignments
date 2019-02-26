package Thread_package;

//Question 2 Use sleep and join methods with thread.

class ThreadJoinSleep extends Thread {
    public void run() {
        System.out.println("Table of 3:");
        for (int i = 1; i <= 10; i++) {
            try {
                Thread.sleep(400);
            } catch (Exception e) {
                System.out.println(e);
            }
            System.out.println(i * 3);
        }
    }

}

public class Question2 {
    public static void main(String args[]) {
        ThreadJoinSleep t1 = new ThreadJoinSleep();
        ThreadJoinSleep t2 = new ThreadJoinSleep();
        ThreadJoinSleep t3 = new ThreadJoinSleep();
        ThreadJoinSleep t4 = new ThreadJoinSleep();


        t1.start();
        try {
            t1.join();
        } catch (Exception e) {
            System.out.println(e);
        }

        t2.start();
        t3.start();
        t4.start();
    }

}

