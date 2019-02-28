package package_java8;
//Write the following a functional interface and implement it using lambda:
//(3) Concatenation of 2 string -----    Parameter (String , String ) Return (String)
@FunctionalInterface
interface Concat{
    String concatString(String s1, String s2);
}

public class Exercise1c {
    public static void main(String[] args) {
        Concat concat= (s1, s2) -> s1+" "+s2;
        System.out.println(concat.concatString("Hello", "World"));

    }
}
