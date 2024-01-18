package Memory_Management;

public class objectpractice // main class 

{
    String state; // instance variable 
    String capital;// instance variable

    objectpractice(String x,String y) // object create ( parameter)
    {
        state = x;   // swapping the instance variable to 
        capital = y; // swapping the instance variable to 
    }

    public static void main(String[] args) // main method of main class
    {
        
        objectpractice A = new objectpractice( "MP" ,"bhopal");  // refrence variable, object call ( argument) 
        objectpractice B = new objectpractice( "CHATTISGARH", "RAIPUR"); //refrence variable, object call ( argument)

        System.out.println(A.state);
        System.out.println(A.capital);
        System.out.println(B.state);
        System.out.println(B.capital);
    }


}

