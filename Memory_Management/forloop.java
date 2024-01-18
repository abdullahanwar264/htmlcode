package Memory_Management;

import java.util.Scanner;


public class forloop 

{
    public static void main(String[] args) 
    {
        System.out.println("enter the number");
       try (Scanner sc = new Scanner (System.in)) {
         int y = sc.nextInt();
          System.out.println(y);
          int i;
   for (i = 0 ; i<=y ; i++);
          if (i%2==0) 
          {
             System.out.println(i);
          }
      }


    }
}
