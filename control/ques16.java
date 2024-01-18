//Write a program to check whether the triangle is equilateral, isosceles or scalene tringle

package control;

public class ques16 
{
    public static void main(String[] args) 
    {
       int a =22;
       int b =22;
       int c =22;
       
       int sum = a + b + c ;
       
       if (a==b&&b==c&&c==a) {
        System.out.println("it is a equilateral tringle");
       }
       else if(sum==180)
       {
        System.out.println("it is a scalene tringle");
       }
       else if (a==b || b==c || c==a)
       {
        System.out.println("isosceles");
       }
      String T = a==b&&b==c&&c==a?"it is a equilateral tringle":sum==180?"it is a scalene tringle":a==b || b==c || c==a?"isosceles":"x";
       System.out.println(T);

    }
}
