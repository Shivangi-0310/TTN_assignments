package Thread_package;

// Question 10 Use Synchronize method to enable synchronization
// between multiple threads trying to access method at same time.

class SynchronizedMethod {
    synchronized public void printTable() {
        System.out.println("Table of 5:");
        for (int i = 1; i <= 5; i++) {
            System.out.println(i * 5);
            try {
                Thread.sleep(700);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}

class Table extends Thread {
    SynchronizedMethod synchronizedMethod;

    Table(SynchronizedMethod synchronizedMethod) {
        this.synchronizedMethod = synchronizedMethod;
    }

    @Override
    public void run() {
        synchronizedMethod.printTable();
    }
}

public class Question10 {
    public static void main(String[] args) {
        SynchronizedMethod synchronizedMethod = new SynchronizedMethod();
        Table table1 = new Table(synchronizedMethod);
        Table table2 = new Table(synchronizedMethod);


        table1.start();
        table2.start();
    }
}
