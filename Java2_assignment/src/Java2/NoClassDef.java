package Java2;

// 3. WAP to produce NoClassDefFoundError and ClassNotFoundException exception.

class Show
{
    void show()
    {
        System.out.println("hello");
    }
}

public class NoClassDef {
    public static void main(String args[])
    {
        Show s = new Show();
        s.show();
    }
}