package Java2;

// 3. WAP to produce NoClassDefFoundError and ClassNotFoundException exception.


public class ClassNotFound {

    public static void main(String[] args) {
        try {
            Class abc = Class.forName("String");
            System.out.println("name of class : " + abc.getName());

        }
        catch (Exception e){
            e.printStackTrace();

        }
    }
}
