 // Write a program to calculate profit or loss

 package control;

public class ques18 {
    public static void main(String[] args) {
        int sp = 57000;
        int cp = 5000;

        if (sp>cp) {
            
            System.out.println(sp-cp+"rs profit");
        } else if (cp>sp) 
        {
            System.out.println(cp-sp + "rs loss");
        }
        else
        {
            System.out.println("no profit , no loss");
        }
       String P = sp>cp?sp-cp+"rs profit":cp>sp?cp-sp + "rs loss":"no profit , no loss";
       System.out.println(P);
    }
}
