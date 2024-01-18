package Memory_Management;


public class pattern 
{
    // public static void main(String[] args) 
    // {
    //     int n = 5;
    //     for (int R = 0 ; R <= n ; R ++)
    //     {

    //     for (int C = ; C <= (n-R)+1   ; C++   )
    //     {

    //      System.out.println("* ");

    //     }
    //      System.out.println( );
    //     }
    // }





      // public static void main(String[] args) 
      // {
      //   int n = 5;
      //   for( int i = 0 ; i <= n ; i++)
      //   {
      //   for(int j = 0 ; j<=i; j++)
      //   {
      //   System.out.print("* ");
      //   }
      //   System.out.println( );
      //   }
        
      // }




      public static void main(String[] args) 
      {
      int n = 6;
      for(int R = 1; R<=n; R++)
      {

      for (int c =1; c<=n-R ; c++ )
      {
        System.out.print("  ");
      }
      for (int c= 1 ; c<=R; c++)
      {
        System.out.print("* ");
      }
      System.out.println();
      }
    }

    // public static void main(String[] args)
    // {
    //   int n =5;
    //   for(int R = 0 ; R<=n-R; R++)
    //   {

    //   for(int c = 0 ; c<=R; c++)
    //   {
    //     System.out.print("  ");
    //   }
    //   for( int c = 0 ; c<=n-R; c++)
    //   {
    //     System.out.print("* ");

    //   }
    //   for(int Q = 0 ; Q<=n; Q++)
      

      


    //     System.out.println( );
      
    // }




  }


