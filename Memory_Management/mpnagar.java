//class mp nagr , is me ek or class zone 1 , is class me variable= manohar 
//is main class me main method , is x ko is main mai access karna hai 
package Memory_Management;

public class mpnagar 

{
    int x; // instence(object) variable

    class zone1
    {
       String x = "manohar" ;
        
    }
    public static void main(String[] args) 
    {
        mpnagar ref = new mpnagar();
        System.out.println(ref.x);
        ref.x=20;
        System.out.println(ref.x );
        zone1 ref2 =  ref.new zone1();
        System.out.println(ref2.x);

        // lical or refrence variable
    }
}
