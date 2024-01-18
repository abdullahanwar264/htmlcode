//create two non static method name india and shrilanka 
// and create an object inside india and create an aobject inside shrilanka
// the object which is crated idie india has two variables named virat ang gill 
//virat holds the run of virat kohli and gill holds the run of gill
// the object which is inside shrilanka has two data members named bhumra and shami
//bhumra has no of wikets and mhd shami has no of wikets
package Memory_Management;

public class twoobject 
{
int virat;
int gill;

twoobject()
{

}

twoobject(int x , int y)
{
virat = x;
gill = y;
}





    public static void main(String[] args) 
    {
        twoobject w = new twoobject();
        threeobject p = new threeobject(1,5);


        w.india();
       threeobject.shrilanka();
    }   

    void india()
    {
       twoobject w = new twoobject( 89,96);
       System.out.println(w.virat);
       System.out.println(w.gill);
       
    }

    

    
}
class threeobject

{
    int bhumrah ;
    int shami;

    threeobject( int a, int b)
    {
        bhumrah = a;
        shami = b;
    }
    
    static void shrilanka()
    {
        threeobject q = new threeobject(1,5);
        System.out.println(q.bhumrah);
        System.out.println(q.shami);

        
    }

}