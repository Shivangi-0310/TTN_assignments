package Java2;

//  6. WAP showing try, multi-catch and finally blocks.

public class MultiTryCatch {
    public static void main(String[] args) {
        try{
            System.out.println("try 1");
            int a= 10;
            int b=0;
            int c=a/b;
            System.out.println(c);
        }
        catch (ArithmeticException e)
        {
            System.out.println("catch 1");
            System.out.println(e);
        }
        finally
        {
            System.out.println("Finally block  1st time");
        }

        try{
            System.out.println("try 2");
            int[] arr = {1,2,3,4,5};
            System.out.println(arr[9]);

            try{
                System.out.println("try 3");
                MultiTryCatch multiTryCatch = null;
                if(multiTryCatch.equals("object"))
                {
                    System.out.println("object");
                }
                else
                {
                    System.out.println("null");
                }
            }
            catch (NullPointerException e)
            {
                System.out.println("catch 2");
                System.out.println(e);
            }
            finally
            {
                System.out.println("Finally block 2nd time");
            }
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("catch 3");
            System.out.println(e);
          
        }
        finally
        {
            System.out.println("Finally block 3rd time");
        }
    }
}
