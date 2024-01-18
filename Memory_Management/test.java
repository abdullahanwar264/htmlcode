package Memory_Management;

public class test 
{
    private static A obj;

    public static void main(String[] args) 
    {
     test x = new test();
     test. obj  = x.new A();
     test.A.c y = test.obj.new c();
     System.out.println(obj.j);
      obj.j = 89;
      System.out.println(obj.j);
       D q = new D();
      System.out.println(q.h);
       D.E m = q.new E();
       D.E b = m.new E();
       System.out.println(m.b);
     

    }

    class A
    {
        int j = 90;
        class c
        {
           double abdullah()
            {
             //abdullah();
             //System.out.println(abdullah());

             int h = 67;
             System.out.println(h);
                return 90.9;
            }
        }

    }
}

class D 
{
   float h = 90.9f;

 class E 
 {
    int i  = 21;
 }
   
}

