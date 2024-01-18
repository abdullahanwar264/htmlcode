//write a program to find max between two numbers

package control;

public class ques1 
{
    public static void main(String[] args)
     {
       int x = 21;
       int y = 45;

       if (x<y) 
       {
        System.out.println(x+" is greater than" +y);
       }
       else if(x>y)
       {
          System.out.println(y +" is greater than" + x);
       }
        else
        {
         System.out.println(x +"is equal to"+ y);
        }

       String z = x<y? x+" is greater than "+ y : x>y? y +" is greater than"+x : x +"is equal to"+ y;

       System.out.println(z);
    }
}
