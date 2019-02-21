package Java2;

//11. Convert the following code so that it uses nested while statements instead of for statements:
//          int s = 0;
//                  int t = 1;
//                  for (int i = 0; i < 10; i++)
//        {
//        s = s + i;
//        for (int j = i; j > 0;j--)
//        {
//        t = t * (j - i);
//        }
//        s = s * t;
//        System.out.println("T is " + t);
//        }
//        System.out.println("S is " + s);


public class ForToWhileLoop {
    public static void main(String[] args) {
        int i = 0;
        int j;
        int s = 0;
        int t = 1;
        while (i < 10) {
            s = s + i;
            j = i;
            while (j > 0) {
                t = t * (j - i);
                j--;
            }
            s = s * t;
            System.out.println("T is " + t);
            i++;
        }
        System.out.println("S is "+s);

        }
    }
