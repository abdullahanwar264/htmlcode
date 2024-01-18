//write a progaram to check weather a number is divisible by 5 and 11 or not

package control;

public class ques4
 {
    public static void main(String[] args)
     {
        int num1 = 222;

        if (num1%5==0) 
        {
            System.out.println("number is divisible by 5");
        }
        else if(num1%11==0)
        {
            System.out.println("divisible by 11");
        }
        else
        {
           System.out.println("not divisible  by 5 and 11");
        }
      String z = num1%5==0?"number is divisible by 5":num1%11==0?"divisible by 11":"not divisible  by 5 and 11";
      System.out.println(z);
    }
}
