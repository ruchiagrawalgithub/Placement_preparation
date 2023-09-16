import java.util.Scanner;
class LeapYear
{
    public static void main(String arg[])
    {
        System.out.println("please enter year");
        Scanner sc = new Scanner(System.in);
        int year=sc.nextInt();
        if(year%4==0 && year%100==0 && year%400==0)
        {
           System.out.println("leap year");
        }
        else
        {
            System.out.println("Not a leapYear");
        }  
    }
}