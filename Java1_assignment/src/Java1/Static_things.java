package Java1;

public class Static_things {
    static String firstname="shivangi";
    static String lastname ="j";
    static int age =23;

    static void display()
    {
        System.out.println("Using static method: ");
        firstname="shivi";
        System.out.println("Firstname is:   " +firstname+ ", Lastname is: " +lastname+ ", Age is:   " +
                age);
    }
    static
    {
        // used to initialize data members
        System.out.println("using static block: ");
        lastname="jain";
        System.out.println("Firstname is:   " +firstname+ ", Lastname is: " +lastname+ ", Age is:   " +
                age);
    }

    public static void main(String[] args) {

        System.out.println("using static variables: ");
        System.out.println("Firstname is:   " +firstname+ ", Lastname is: " +lastname+ ", Age is:   " +
                age);
        Static_things.display();
    }
}
