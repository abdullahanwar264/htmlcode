// Write a program to input angles of a triangle and check whether triangle is valid or not
package control;

public class ques14 {
    public static void main(String[] args) {
        int A1 = 40;
        int A2 = 60;
        int A3 = 80;

        int sum = A1 + A2 + A3 ;

        if (sum==180 && A1>0 && A2>0 && A3>0) 
        {
            System.out.println("for the given angles the tringle is valid");
        }
        else{
            System.out.println("for the given angles the tringle is not valid");
        }

        String TTT = sum==180 && A1>0 && A2>0 && A3>0?"for the given angles the tringle is valid" :"for the given angles the tringle is not valid";
        System.out.println(TTT);       
    }
}
