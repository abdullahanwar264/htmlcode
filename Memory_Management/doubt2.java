package Memory_Management;

public class doubt2 
{
    public static void main(String[] args) 
    {
        long x = 0b00000000000000000000000000000000000000000000000000000000000000001;
        long y = x<<64;

        System.out.println(y);
    }
}
