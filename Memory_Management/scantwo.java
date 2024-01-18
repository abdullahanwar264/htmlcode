package Memory_Management;


import java .util.Scanner;

public class scantwo

{


   public static void main(String[] args)
    {
    System.out.println("enter the number");
      try (Scanner sc = new Scanner(System.in)) {
         int y = sc.nextInt();
         System.out.println(y);
      }
   }
}
