//. If the ages of Ram, Shyam and Ajay are input through the keyboard, write a program to 
//determine the youngest of the three
package control;

public class ques29 
{
    public static void main(String[] args) 
    {
        int ram = 24;
        int shyam = 22;
        int ajay = 20;

        if (ram<shyam&&ram<ajay) 
        {
            System.out.println(ram+"is the youngest");
        }
        else if (shyam<ram && shyam<ajay) 
        {
            System.out.println(shyam+"is the youngest");
        }
        else
        {
            System.out.println(ajay+"is the youngest");
        }
        String Z =  ram<shyam&&ram<ajay?ram+"is the youngest":shyam<ram && shyam<ajay?shyam+"is the youngest":ajay+"is the youngest";
        System.out.println(Z);
    }
}
