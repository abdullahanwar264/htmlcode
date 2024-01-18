//Write a program to input week number and print week day
package control;

public class ques11 
{
    public static void main(String[] args)
     {
        int s = 2;

        if (s==1) 
        {
        System.out.println("MONDAY");    
        }
        if (s==2) {
            System.out.println("TUESDAY");
        }
        if (s==3) {
            System.out.println("WEDNESDAY");
        }if (s==4) {
            System.out.println("THURSDAY");
        }
        if (s==5) {
            System.out.println("FRIDAY");
        }
        if (s==6) {
            System.out.println("SATARDAY");
        }
        if (s==7) {
            System.out.println("SUNDAY");
        }
       String EEE = s==1?"MONDAY": s==2?"TUESDAY": s==3?"WEDNESDAY": s==4?"THURSDAY": s==5?"FRIDAY": s==6?"SATARDAY": s==7?"SUNDAY": "q";
       System.out.println(EEE);
    }
}
