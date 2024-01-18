package Memory_Management;

public class pattren2 

{
    public static void main(String[] args)
     {
        int a = 5;
        for (int i = 0 ; i<=a; i++)
        { 

        for (int j=1 ; j<i; j++)
        {
        System.out.print("  ");
        }
        for(int j=1; j<i; j++)
        {
        System.out.print("* ");
        }
        System.out.println(  );
        }

    }


    // public static void main(String[] args) 
    //   {
    //   int n = 6;
    //   for(int R = 1; R<=n; R++)
    //   {

    //   for (int c =1; c<=n-R ; c++ )
    //   {
    //     System.out.print("  ");
    //   }
    //   for (int c= 1 ; c<=R; c++)
    //   {
    //     System.out.print("* ");
    //   }
    //   System.out.println();
    //   }
    // }

    // public static void main(String[] args)
    //  {
    // int n = 6;

    // for(int i = 0; i<=n; i++)
    // {
    //     for(int j=0;j<i; j++ )
    //     {
    //         System.out.print("  ");
    //     }


    //     for(int j=1; j<n-i; j++)
    //     {
    //         System.out.print("* ");
    //     }

    //     for(int j=0; j<n-i; j++)
    //     {
    //         System.out.print("* ");
    //     }
    //        System.out.println(  );
    // }
    // }
}
