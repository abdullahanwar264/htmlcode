package Memory_Management;

public class SIRT 

{


    public static void main(String[] args) 
    {
       SIRT a = new SIRT();
       System.out.println(a);
       cse b = a.new cse();
       System.out.println(b);
       CSE c = a.new CSE();
       System.out.println(c);
       CSE2 d = a.new CSE2();
       System.out.println(d);
       CSIT e = new CSIT();
       System.out.println(e);

    }

    class cse
    {
        int x = 21;
        void SECA()
        {

        }

    }

    class CSE
    {
        int y = 33;
        void SECB()
        {

        }

    }
    class CSE2
    {
        int z = 44;
        void SECC()
        {

        }
    }
}

class CSIT
{
    int a = 11;
    void seca()
    {

    }
}
