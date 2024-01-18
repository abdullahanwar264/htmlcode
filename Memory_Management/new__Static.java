package Memory_Management;

public class new__Static 

{


        int age ;
        String name;
        String clg;       // instance variable...
    
        //whenever you build a  class a constructor always create it selfc
        //1..constructor is a special method it is hidden 
        //2.... the name of the constructor is same as the class name 
        //3.....constructor never returns anything ...
        //4....constructor never has a return data type...
        //5..... if constructor does not return any thing what is the purppose of constructor
        //..6..... if constructor is a method where we can  call constructor
        new__Static(int x, String y, String z){
          age =x;
          name = y;
          clg = z;  
    
        }
        public static void main(String[] args) {
          new__Static huzaifa =  new new__Static(21,"huzaifa", "iper");
          new__Static shivani =  new new__Static(22,"shivani", "nri");
          new__Static aman  =  new new__Static(21,"aman","ct");
        System.out.println(huzaifa.age);
        System.out.println(shivani.age);
        System.out.println(aman.age);
         System.out.println(huzaifa.name);
        System.out.println(shivani.name);
        System.out.println(aman.name);
     System.out.println(huzaifa.clg);
        System.out.println(shivani.clg);
        System.out.println(aman.clg);
        }
        
    
    
    
    } 

