package Memory_Management;

public class mpnagar2 

{
    public static void main(String[] args) 
    {
       zone1 ref = new zone1();
       System.out.println(zone1.x);
       zone1.x = 23;
       System.out.println(zone1.x);
       zone1.x=45;
       System.out.println(zone1.x);
       System.out.println(ref.y);

        
    }

}

class zone1
{
 static int x = 90;
 int y = 33; // insteance variable

}
