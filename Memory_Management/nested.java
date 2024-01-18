package Memory_Management;

public class nested {

    public static void main(String[] args) 
{
a onea = new a();
a.b twob = onea.new b();


}

}

class a {

    int print() {
        System.out.println("i am print");
        int h = 90;
        System.out.println(h);
        return 50;

    }
    static int  cat()
    {
     System.out.println(" i am cat");
    return 20;

    }

    class b 
    {

        int value() 
        
        {
            System.out.println(" iam value");
            return 90;
        }
    }

}
