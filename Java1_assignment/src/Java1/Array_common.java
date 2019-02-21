package Java1;

import java.util.Scanner;

public class Array_common {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the size of array 1");
        int size1= sc.nextInt();
        int [] array1= new int[size1];
        System.out.println("enter array1 elements: ");
        for(int i=0;i<array1.length;i++)
        {
            array1[i]= sc.nextInt();
        }

        for(int i=0;i<array1.length;i++)
        {
            System.out.println("array1 elements: "+array1[i]);
        }


        System.out.println("enter the size of array 2:");
        int size2= sc.nextInt();
        int [] array2= new int[size2];
        System.out.println("enter array2 elements: ");
        for(int i=0;i<array2.length;i++)
        {
            array2[i]= sc.nextInt();
        }

        for(int i=0;i<array2.length;i++)
        {
            System.out.println("array2 elements: "+array2[i]);
        }
        System.out.println("common elements are: ");
            for (int i = 0; i < array1.length; i++) {

                for (int j = 0; j < array2.length; j++) {
                    if (array1[i] == array2[j])
                        break;
                }
                    System.out.print(array1[i]+" ");
            }



    }
}
