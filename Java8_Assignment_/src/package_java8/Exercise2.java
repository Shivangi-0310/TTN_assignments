package package_java8;
//2. Create a functional interface whose method takes 2 integers and return one integer.

@FunctionalInterface
interface IntegerOperation{
    int performSomething(int a, int b);

}

public class Exercise2 {
    public static void main(String[] args) {
        IntegerOperation integerOperation= (a,b)-> a+b;
        System.out.println("Taking 2 ints and returning sum: "+integerOperation.performSomething(10,30));
    }

}
