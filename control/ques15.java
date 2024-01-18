// Write a program to input all sides of a triangle and check whether triangle is valid or not

package control;

public class ques15 {
    public static void main(String[] args) {
        
        int s1= 22;
        int s2= 7;
        int s3 = 8;

        if (s1+s2>s3&&s2+s3>s1&&s1+s3>s2) {
            System.out.println("it is a triangle");
        } else {
            System.out.println("not a tringle");
        }
      String X =  s1+s2>s3&&s2+s3>s1&&s1+s3>s2?"it is a triangle":"not a tringle";
      System.out.println(X);

    }
}
