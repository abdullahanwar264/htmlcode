package Memory_Management;

public class object1 

{
    public static void main(String[] args) 
    
    {
        object1 obj1 = new object1();
        object2 x = new object2();
         object1 sc = new object1();
    }

}

class object2
{

    public static void main(String[] args)
     {

        object2 obj2 = new object2();
        object1 obj3 = new object1();
    
    }

}