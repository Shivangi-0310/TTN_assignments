package package_java8;

//7.Override the default method of the interface.

interface Java8{
    default void doSomething()
    {
        System.out.println("this is a default method");
    }

}

public class Exercise7 implements Java8 {
    public void doSomething()
    {
        //Java8.super.doSomething();
        System.out.println("this is overriding of doSomething method.");
    }

    public static void main(String[] args) {
        Exercise7 exercise7= new Exercise7();
        exercise7.doSomething();
    }
}
