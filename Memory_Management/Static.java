package Memory_Management;

public class Static 

{

    public static void main(String[] args) 
    {
        
        System.out.println("this is a main fucntion of static");
        abdullah();
        static1.abdul();
    }
   
    static boolean abdullah()
    {
        int s = 21;
        System.out.println(s);
        return true;
    }
    
}

class static1
    {

        public static void main(String[] args) 
        
        {
            System.out.println("this is the main function of static1 ");
        }
        static int abdul()
        {
            int x = 51;
            System.out.println(x);

            return 20;
        }
        
    }
