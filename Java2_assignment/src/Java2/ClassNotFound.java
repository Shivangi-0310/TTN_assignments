package Java2;
// Question 3b

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
