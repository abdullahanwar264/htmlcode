import java.util.*;

public class squarepattern 
{
    // public static void main(String[] args) 
    // {
    //    Scanner sc = new Scanner(System.in);

    //    int n = sc.nextInt();


    //    for(int i=1; i<=n; i++)
    //    {
    //     for(int j=1; j<=i; j++)
    //     {
    //         if (i==1 || i==n || j==1 || j==n) 
    //         {
    //             System.out.print(" *");
    //         }
    //         else
    //         {
    //            System.out.print("  ");
    //         }
    //     }
    //        System.out.println();
    //    }

    // }



    // right angle tringle
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);

    //     int n = sc.nextInt();


    //     for(int i=1; i<=n; i++)
    //     {
    //         for(int j=1; j<=i; j++)
    //         {
    //           if (j==i || j==1 || i==n || i==1 ) {
    //             System.out.print(" *");
    //           } else {
    //             System.out.print("  ");
    //           }

    //         }
    //         System.out.println();
    //     }
    // }




    // public static void main(String[] args) {
        // Scanner sc = new Scanner (System.in);

        // int n = sc.nextInt();

    //     for(int i=1; i<=n; i++)
    //     {
    //         for(int j=n; j>=i; j--)
    //         {
    //             System.out.print("  ");
    //         }

    //         for(int k=1; k<=i; k++)
    //         {
    //             if (k==1 || k==i || i==n || i==1 ) 
    //             {
    //                 System.out.print(" *");
    //             }
    //              else 
    //             {
    //                 System.out.print("  ");
    //             }
    //         }
    //         System.out.println();
    //     }
    // }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for(int i=1; i<=n; i++)
        {
            for(int j=n; j>=i; j--)
            {
                System.out.print("  ");
            }
            for(int k=1; k<=n; k++)
            {
                if (k==1 || k==(2*i-1) || i==n )
                {
                    System.out.print("  ");
                } 
                else 
                {
                  System.out.print(" *");    
                }
            }
            System.out.println();
        }

    }

}
