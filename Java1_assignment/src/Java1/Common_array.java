package Java1;

import java.util.Arrays;

public class Common_array {
    public static void main(String[] args) {
        int[] arr1={1,2,3,4,4,5,6,7,8};
        int[] arr2={1,2,3,4,3};
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        for(int i=0, j=0; i<arr1.length&& j<arr2.length;)
        {
            if(arr1[i]<arr2[j])
            {
                i++;
            }
            else if (arr1[i]>arr2[j])
            {
                j++;
            }
            else{
                System.out.print(arr1[i]+ " ");
                i++;
                j++;
            }
        }



    }
}
