public class leapyearconditional
 {
public static void main(String[] args) 
 {
   int year = 2000;
//    if (year%4 == 0) 
//    {
//     if (year%100 !=0) 
//     {
//         System.out.println("it is a leap year");
//     } 
//     else if (year%400 == 0) 
//     {
//       System.out.println("IT IS A LEAP YEAR ");  
//     }
//     else 
//     {
//         System.out.println("not a leap year");
//     }
//    }
//     else 
//     {
//     System.out.println("IT is not a leap year");
  
// }

String y =  year%4 == 0? year%100 !=0 ?"it is a leap year": year%400 == 0? "IT IS A LEAP YEAR " : "not a leap year" : "IT is not a leap year";
System.out.println(y);
}
}