import java . util.Scanner;

public class arrayinput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the size of the array");
        // creation of the empty array object
        int size = sc.nextInt();


        String[] arr = new String[size]; 

        // input element inside an array

        for (int i=0; i<size; i++)
        {
            System.out.println("enter the element");
            arr[i] = sc.nextLine();
        }

        System.out.println("this is the array");

        // display array element
        for(String a : arr)
        {
            System.out.println(a);
        }


        // FOR EACH :-

        // it is only used in the concept of arrays.

        // it is used for displaying purpose , taking input using for each is not allowed.

        // datatype = depends on value inside an array.

        // SYNTEX :-

        // for( datatype variable name : arrayname)
         {
            //statement;

        // }
    }
}

}
