import java.util.Scanner;
class Table
{
    public static void main(String arg[])
    {
        System.out.println("please enter a number");
        Scanner sc = new Scanner(System.in);
        int num =sc.nextInt();
        for(int i=1;i<=10;i++)
        {
            int table =num * i;
            System.out.println(table);
        }
    }
}