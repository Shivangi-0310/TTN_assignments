package Java2;

 //Question 3a
class Show
{
    void show()
    {
        System.out.println("hello!");
    }
}

public class NoClassDef {
    public static void main(String args[])
    {
        Show s = new Show();
        s.show();
    }
}