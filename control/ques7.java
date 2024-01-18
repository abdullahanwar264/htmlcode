// Write a program to check whether a character is alphabet or not

package control;

public class ques7
 {
    public static void main(String[] args)
     {
        char c = 'q';

        if ((c>='a' && c<='z') || (c>='A'&& c<='Z'))
        {
            System.out.println(c+"is a alphabate");

        } else 
        {
            System.out.println(c+"is not a alphabate");
        }
       String W = c>='a' && c<='z'?c+"is a alphabate":c+"is not a alphabate";
        System.out.println(W);

    }
}
