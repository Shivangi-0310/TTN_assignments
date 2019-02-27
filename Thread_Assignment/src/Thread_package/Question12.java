package Thread_package;
// Question 12 Use Atomic Classes instead of Synchronize method and blocks.
    import java.util.concurrent.atomic.AtomicInteger;

public class Question12 {

    AtomicInteger number = new AtomicInteger();

    public void method1() {
        for (int i = 1; i <= 100; i++) {
            number.incrementAndGet();
        }
    }

    public void method2() {
        for (int i = 1; i <= 400; i++) {
            number.incrementAndGet();
        }
    }

    public static void main(String[] args) throws InterruptedException {

        Question12 question12 = new Question12();
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                question12.method1();
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                question12.method2();
            }
        });
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
        System.out.println("Result: "+question12.number);
    }
}