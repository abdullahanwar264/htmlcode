// Write a program to count total number of notes in given amount
package control;

public class ques13 
{
    public static void main(String[] args) 
    
    {
        int x= 5555;

        if (x%500==0) {
            System.out.println(x/500+"notes of 500");
        }
         if (x%100==0) {
            System.out.println(x/100 +"notes of 100");
        }
         if (x%50==0) {
            System.out.println(x/50+"notes of 50");
        }
        else {
            System.out.println(x+"single note");
        }
    }
}
