package Java2;

// 4. WAP to create singleton class.

public class SingletonClass {

   private static SingletonClass singletonClass=null;
    String s;
    private SingletonClass()
    {
        s = "This is singleton class";
    }
   static SingletonClass SingletonClass()
    {
               if(singletonClass==null)

                   singletonClass=new SingletonClass();
                   return singletonClass;

    }

    public static void main(String[] args) {
        SingletonClass s1= SingletonClass.SingletonClass() ;
        SingletonClass s2= SingletonClass.SingletonClass() ;
        System.out.println(s1);
        System.out.println(s2);
        s1.s= (s1.s).toUpperCase();

        System.out.println(s1.s);
        System.out.println(s2.s);


    }

}
