//write a progarm to find max between three numbers
package control;

public class ques2 
{
    public static void main(String[] args) 
    {
        int x = 31;
        int y = 5;
        int z = 21;

        if (x>y&&x>z) 
        {
            System.out.println(x+"biggest number");
        } else if(y>x&&y>z)
        {
           System.out.println(y + "biggest number"); 
        }
        else 
        {
            System.out.println(z+"buggest number");
        }

      String w =  x>y&&x>z? x+"biggest number":y>x&&y>z?y + "biggest number":z+"buggest number";
      System.out.println(w);
    }
}
