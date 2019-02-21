package Java1;
import java.util.Scanner;

public class Duplicate_string {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string: \n");
        String s1= sc.nextLine();
        System.out.println("lngth: "+s1.length());
        int count=1;
        String[] word = s1.split(" ");
        for(int i=0; i< word.length;i++)
        {
            for(int j= i+1; j<word.length;j++)
            {
                if(word[i].equals(word[j]))
                {
                    count+=1;
                    word[j]= "0";

                }
            }
            if(word[i]!="0" && count>1) {
                System.out.println("Duplicate word: " + word[i] + " and count is :  " + count);
            }
                count=1;

        }

    }

}
