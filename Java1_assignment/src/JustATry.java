import java.util.*;
public class JustATry
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter String: ");
        String input = sc.nextLine();// Accept input
        input=input+" ";// Add a space at end of input
        int now=0,i=0,sindex=0,cw=0,j=0;//now-->Find number of words
        for (i=0;i<input.length();i++)
        {
            char ch = input.charAt(i);
            if (ch == ' ')
            {
                now++;
            }
        }
        String[]words = new String[now];//An array to Extract words and store in the array
        for (i=0;i<input.length();i++)
        {
            char ch=input.charAt(i);
            if (ch == ' ')
            {
                String word=input.substring(sindex, i);//Extraction of words
                words[cw]=word;
                cw++;
                sindex=i+1;
            }
        }
        for (i=0;i< words.length-1;i++) // Sort words
        {
            for (j = 0; j < (words.length - i - 1); j++)
            {
                if (words[j].compareToIgnoreCase(words[j + 1])>0)/**checking for difference in strings ignoring case variation*/
                {
                    String temp=words[j];
                    words[j]=words[j + 1];
                    words[j + 1]=temp;
                }
            }
        }
        for (i=0;i<words.length;i++)// Print words
        {
            System.out.print(words[i] + " ");
        }
        System.out.println();
    }//End of main
}//E