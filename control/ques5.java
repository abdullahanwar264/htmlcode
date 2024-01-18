// write a program to check weather a number is odd or even

package control;

public class ques5 
{
    public static void main(String[] args)
    {
     int num1 = 12;

      if(num1%2==0)
      {
       System.out.println(num1 + "is a even number ");
      }  
      else
      {
       System.out.println(num1 + "is a odd number");
      }

     String z = num1%2==0?num1 + "is a even number " :num1 + "is a odd number";
     System.out.println(z);

   }
}
