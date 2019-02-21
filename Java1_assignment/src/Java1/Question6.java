package Java1;
import java.util.Scanner;
public class Question6 {

    public static void main(String[] args) {
        int size;
        System.out.println("enter size of array: ");
        Scanner sc=new Scanner(System.in);
        size=sc.nextInt();


        int[] array= new int[size];
        System.out.println("enter array1 elements: ");
        for(int i=0;i<size;i++)
        {
            array[i]= sc.nextInt();
        }

        for(int i=0;i<array.length;i++)
        {
            System.out.println("array1 elements: "+array[i]);
        }

        int count=array[0];
        for(int i=1; i<size;i++)
        {
            count=count^array[i];
        }
        System.out.println("element occurring once : " +count);
    }
}
