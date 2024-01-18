// Write a program to input month number and print month Name
package control;

public class ques12 
{
    public static void main(String[] args) 
    {
        int x = 12;

        if (x==1) 
        {
            System.out.println("january");
        }
        if (x==2) {
            System.out.println("february");
        }
        if (x==3) {
            System.out.println("march");
        }
        if (x==4) {
            System.out.println("april");
        }
        if (x==5) {
            System.out.println("may");
        }
        if (x==6) {
            System.out.println("june");
        }
        if (x==7) {
            System.out.println("july");
        }
        if (x==8) {
            System.out.println("augaust");
        }
        if (x==9) {
            System.out.println("september");
        }
        if (x==10) {
            System.out.println("october");
        }
        if (x==11) {
            System.out.println("november");
        }
        if (x==12) {
            System.out.println("december");
        }
        String AAA = x==1? "jan": x==2?"feb": x==3?"mar": x==4?"apr":x==5?"may": x==6?"jun": x==7?"july": x==8?"aug": x==9?"sep": x==10?"oct": x==11?"nov": x==12?"dec":"w"; 
        System.out.println(AAA);
    }
}
