package Java1;

import java.util.Arrays;

public class Question6b {
    public static void main(String[] args) {
        int[] arr = {1,3,4,2,3,4,1,2,9,5,9};
        Arrays.sort(arr);
        for (int i=0; i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
        for (int i=0;i<arr.length;i+=2)
        {
            if(i==arr.length-1)
            {
                System.out.println(" element occuring once : "+arr[i]);
                break;
            }
           if(arr[i]==arr[i+1])
           {
               continue;
           }
           else {
               System.out.println(" element occuring once : "+arr[i]);
               break;
           }
        }
    }
}
