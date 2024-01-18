// Write a program to check whether a year is leap year or not 
package control;

public class ques6 
{
    public static void main(String[] args) 
    {
        int num1 = 2000;

        if (num1%4==0)
         {
           if (num1%100 !=0) 
           {
            System.out.println("divisible by 100");
           } 
        } 
         if(num1%400==0) 
        {
            System.out.println("is a leap year");
        }
        else
        {
            System.out.println("not a leap year");
        }
      String z = num1%4==0? num1%100!=0? "divisible by 100": num1%400==0 ? "is a leap year" : "not a leap year":"x" ;
      System.out.println(z);
    }
}
