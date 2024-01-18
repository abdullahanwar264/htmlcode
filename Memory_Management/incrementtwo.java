package Memory_Management;

public class incrementtwo 
{
    public static void main(String[] args) 
    {
        int x= 5;
        int y= 6;

        System.out.println(x + y++ + y+x + (x++ + x) + y++ +y);
    }
}
