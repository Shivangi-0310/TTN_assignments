package DesignPatterns;

public class SingletonSynchronized {
    private static SingletonSynchronized singletonSynchronized=null;
    private SingletonSynchronized()
    {

    }
    public synchronized static SingletonSynchronized returnInstance()
    {
        if (singletonSynchronized==null)
            singletonSynchronized= new SingletonSynchronized();
            return singletonSynchronized;
    }

    public static void main(String[] args) {
        SingletonSynchronized singletonSynchronized1= SingletonSynchronized.returnInstance();
        System.out.println(singletonSynchronized1);
        System.out.println(singletonSynchronized);
    }
}
