package package_java8;

//Write the following a functional interface and implement it using lambda:
//(2) Increment the number by 1 and return incremented value ---- Parameter (int) Return int


@FunctionalInterface
interface Increment{
    int incrementNumber(int a);
    }

public class Exercise1b {
    public static void main(String[] args) {
        Increment increment= a -> ++a;
        System.out.println("Incremented no.: "+increment.incrementNumber(10));
    }

}
