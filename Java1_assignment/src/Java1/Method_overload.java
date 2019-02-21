package Java1;
public class Method_overload {

    int add(int a, int b){
        return a+b;
    }
    double add(double a, double b)
    {
        return a+b;
    }
    int product(int a, int b)
    {
        return a*b;
    }
    float product(float a, float b)
    {
        return a*b;
    }
    String concatenation(String s1, String s2)
    {
        return s1+s2;
    }
    String concatenation(String s1, String s2, String s3)
    {
        return s1+s2+s3;
    }
    public static void main(String[] args) {
        Method_overload m= new Method_overload();
        System.out.println("sum of integers: "+ m.add(10,20));
        System.out.println("sum of double: "+ m.add(10.1, 19.7));
        System.out.println("product of integers: "+ m.product(33,67));
        System.out.println("product of float: "+ m.product(10.88f,195.8f));
        System.out.println("concatenation of two strings: "+  m.concatenation("To","the"));
        System.out.println("concatenation of three strings: "+ m.concatenation("To","the","new"));

    }
}
