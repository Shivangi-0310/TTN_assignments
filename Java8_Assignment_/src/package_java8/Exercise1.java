package package_java8;
//Write the following a functional interface and implement it using lambda:
//
//(1) First number is greater than second number or not---- Parameter (int ,int ) Return boolean




@FunctionalInterface
interface Number{
    boolean greater(int a, int b);
}

public class Exercise1 {
    public static void main(String[] args) {
        Number number= (a,b)-> a>b;
        System.out.println("First no. is greater than second: "+number.greater(10,20));
    }
}
