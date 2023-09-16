import java.util.Scanner;

class Count
{
    public static void main(String arg[])
    {
        System.out.println("please enter a number");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int count=0;
        while(num>0)
        {
            num=num/10;
            count++;
        }
        System.out.println(count);
    }
}