package Memory_Management;


 import java . util.*;

public class question 

{
    

    // public static void main(String[] args) 
    // {
    //     Scanner sc = new Scanner(System.in);
    
    //     int n = sc.nextInt();
    
    //     for(int i= 1, p=1; i<=n; i++, p+=2)
    //     {
    //         for(int j=1; j<=i; j++)
    //         {
    //             System.out.print(p+" ");
    //         }
    //         System.out.println();
    //     }
    
    //     for(int i =1, p=7 ; i<=n; i++, p-=2)
    //     {
    //         for(int j=n; j>i; j--)
    //         {
    //             System.out.print(p+" ");
    //         }
    //         System.out.println();
    //     }
    // }



    public static void main(String[] args) 
{
    try (Scanner sc = new Scanner(System.in)) {
        int n=sc.nextInt();
  
        for(int i=1, p=1; i<=n; i++, p++)
        {
            for(int j=1; j<=n-i; j++)
            {
                System.out.print("  ");
            }
            for(int k=1; k<=2*i-1; k++)
            {
                System.out.print(p+" ");
            }
                System.out.println();
        }
    }

}
}
