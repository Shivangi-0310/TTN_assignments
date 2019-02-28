package package_java8;

//8.Implement multiple inheritance with default method inside  interface

interface Parent {
    default void perform() {
        System.out.println("This is parent class method.");
    }
}

interface Child1 extends Parent {
    default void perform() {
        System.out.println("This is child1 class method.");
    }
}

interface  Child2 extends Parent {
    default void perform() {
        System.out.println("This is child2 class method.");
    }
}

public class Exercise8 implements Child1,Child2 {
    public void perform()
    {
      //Child2.super.perform();
      System.out.println("This is exercise8 class method");
    }

    public static void main(String[] args) {
        Exercise8 exercise8 = new Exercise8();
        exercise8.perform();
    }

}
