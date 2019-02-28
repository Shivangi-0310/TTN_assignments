package package_java8;

//6. Create and access default and static method of an interface.


interface Sample {
    default void show() {
        System.out.println("This is a default method of interface.");
    }

    static void display() {
        System.out.println("This is a static method of interface.");

    }
}

public class Exercise6 implements Sample {
    public static void main(String[] args) {
        Sample s = new Exercise6();
        //default method
        s.show();
        //calling static
        Sample.display();
    }
}
