//Write a program to input any alphabet and check whether it is vowel or consonant

package control;

public class ques8 
{
    public static void main(String[] args) 
    {
        char alpha='2';

        if (alpha=='a' || alpha=='e' || alpha=='i' || alpha=='o' || alpha=='u') 
        {
            System.out.println(alpha +"is a vowel");
        }
         else 
         {
            System.out.println(alpha + "is not a vowel");
        }
     String A = alpha=='a' || alpha=='e' || alpha=='i' || alpha=='o' || alpha=='u'?alpha +"is a vowel":alpha + "is not a vowel";

     System.out.println(A);
    }
}
