//. Write a Java program that accepts three numbers and check All numbers are equal or not
package control;

public class ques36 
{
    public static void main(String[] args) 
    {
        int x = 21;
        int y = 22;
        int z = 21;

        if (x==y&&y==z&&z==x) 
        {
            System.out.println("all numbers are equal");
        } else 
        {
            System.out.println("All numbers are equal or not");
        }
        String Z =  x==y&&y==z&&z==x?"all numbers are equal":"All numbers are equal or not";
        System.out.println(Z);
    }
    
}
