package Thread_package;
// Question 11 Use Synchronize block to enable synchronization between multiple
// threads trying to access method at same time.
class SynchronizeBlock {

    void printMessage(String string) {
        synchronized (this) {
            for (int i = 1; i <= 3; i++) {
                System.out.println(string);
                try {
                    Thread.sleep(1000);
                } catch (Exception e) {
                    System.out.println(e);
                }
            }
        }
    }
}

class ThreadClass1 extends Thread {

    SynchronizeBlock synchronizeBlock;

    ThreadClass1(SynchronizeBlock synchronizeBlock) {
        this.synchronizeBlock = synchronizeBlock;
    }

    public void run() {
        synchronizeBlock.printMessage("Hello Thread1");
    }

}

class ThreadClass2 extends Thread {
    SynchronizeBlock synchronizeBlock;

    ThreadClass2(SynchronizeBlock synchronizeBlock) {
        this.synchronizeBlock = synchronizeBlock;
    }

    public void run() {
        synchronizeBlock.printMessage("Bye Thread2");
    }
}

class Question11 {
    public static void main(String args[]) {
        SynchronizeBlock synchronizeBlock = new SynchronizeBlock();
        ThreadClass1 t1 = new ThreadClass1(synchronizeBlock);
        ThreadClass2 t2 = new ThreadClass2(synchronizeBlock);
        t1.start();
        t2.start();
    }
}


