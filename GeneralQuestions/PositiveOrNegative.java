import java.util.Scanner;
class PositiveOrNegative
{
    public static void main(String arg[])
    {   System.out.println("Enter a number");
        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();
         if(num==0)
        {
            System.out.println("number is zero");
        }
        else if(num>0)
        {
            System.out.println("positive number");
        }
        else 
        {
            System.out.println("negative number");
        }
    }
}