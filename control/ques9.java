//Write a program to input any character and check whether it is alphabet, digit or special character

package control;

public class ques9
 {
    public static void main(String[] args) 
    {
        char x = 9000;

        if (x>=65 && x<=90) //ascii
        {
            System.out.println(x+ "is a character");
        } 
        else if (x>=0 && x<=9)
          {
            System.out.println(x+"is a digit");
        }
        else
        {
            System.out.println(x+ "is a special character");
        }
        String Q = x>='a' && x<='z'? x+ "is a character" :x>=1 && x<=9? x+"is a digi t":x+ "is a special character";
        System.out.println(Q);
    }
}
