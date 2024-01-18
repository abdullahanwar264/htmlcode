//Write a program to check whether a character is uppercase or lowercase alphabet

package control;

public class ques10 
{
    public static void main(String[] args) 
    {
        char chr = 'W';
        if (chr>='a' && chr<='z' )
         {
           System.out.println(chr+ "is a lowercase alphabate"); 
        }
         else 
         
         {
            System.out.println(chr+ "is a uppercase alphabate");            
         }
       String TTT =  chr>='a' && chr<='z'?chr+ "is a lowercase alphabate":chr+ "is a uppercase alphabate";
       System.out.println(TTT);
    }
}
