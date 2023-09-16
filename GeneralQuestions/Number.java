import java.util.Scanner;
class Number
{
    public static void main(String arg[])
    {   
        System.out.println("please enter a Number");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
       // int num = 0;
        if(num>0)
        {
            System.out.println("positive Number");
        }
        else if(num==0)
        {
            System.out.println("Number is zero");
        }
        else
        {
            System.out.println("Number is negative");
        }
    }
}