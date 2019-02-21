package Java1;
import java.util.Scanner;

public class Char_percentage {
    public static void main(String[] args) {
        int uppercase =0;
        int lowercase =0;
        int digit =0;
        int space=0;
        int special_char =0;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the string:");
        String s1= sc.nextLine();
        int str_length= s1.length();
        for(int i=0; i<str_length;i++)
        {
            char c= s1.charAt(i);
            if(Character.isUpperCase(c))
            {
                uppercase++;
            }
            else if(Character.isLowerCase(c))
            {
                lowercase++;
            }
            else if(Character.isDigit(c))
            {
                digit++;
            }
            else if(Character.isSpaceChar(c)){
                space++;

            }
            else
            {
                special_char++;
            }
        }
        System.out.println(str_length);
       double upper_percent= (uppercase*100)/str_length;
        double lower_percent= (lowercase*100)/str_length;
        double digit_percent= (digit*100)/str_length;
        double space_percent = (space*100)/str_length;
        double specialChar_percent= (special_char*100)/str_length;
        System.out.println("Total number of uppercase letters are "+uppercase+" and their percentage is "
                        +upper_percent+"%");
        System.out.println("Total number of uppercase letters are "+lowercase+" and their percentage is "
                +lower_percent+"%");
        System.out.println("Total number of uppercase letters are "+digit+" and their percentage is "
                +digit_percent+"%");
        System.out.println("Total number of uppercase letters are "+space+" and their percentage is "
                +space_percent+"%");
        System.out.println("Total number of uppercase letters are "+special_char+" and their percentage is "
                +specialChar_percent+"%");
    }


}
