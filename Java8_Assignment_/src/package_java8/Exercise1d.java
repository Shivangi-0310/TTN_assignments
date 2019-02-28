package package_java8;
//Write the following a functional interface and implement it using lambda:
//(4) Convert a string to uppercase and return------  Parameter (String) Return (String)
@FunctionalInterface
interface Uppercase
{
    String toUpperCase(String s1);
}

public class Exercise1d {
    public static void main(String[] args) {


        Uppercase uppercase = s1 -> s1.toUpperCase();
        System.out.println("String in uppercase: "+uppercase.toUpperCase("hello world"));
    }
}
