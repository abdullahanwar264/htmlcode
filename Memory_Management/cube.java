package Memory_Management;

public class cube
 {          

        int volumeofcube(int c){
           int ans = c*c*c;
   
   
   return ans ;
       } 
   
   
   
   
       public static void main(String[] args) {
         cube volumeCube = new cube();
   
         System.out.println("volume of cube =>" + volumeCube.volumeofcube(7));
           
       }
        
       
   }