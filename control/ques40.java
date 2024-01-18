//Write a Java program to check whether the given integer is a multiple of 5
package control;

public class ques40 
{
 public static void main(String[] args) 
 {
    int x = 552;

    if (x%5==0) 
    {
        System.out.println(x+"is a multiple of 5");
    } 
    else 
    {
       System.out.println(x+"is not a multiple of 5");

    }
      String Z = x%5==0?x+"is a multiple of 5":x+"is not a multiple of 5";
      System.out.println(Z);
 }   
}
