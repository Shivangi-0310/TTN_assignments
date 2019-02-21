package Java2;

public class Singleton_class {
    private static Singleton_class s=null;
    private Singleton_class()
    {
        
    }
    static Singleton_class getObject()
    {
        if (s==null)
        {
            s=new Singleton_class();
            return s;
        }
        else
            return s;
    }
}
