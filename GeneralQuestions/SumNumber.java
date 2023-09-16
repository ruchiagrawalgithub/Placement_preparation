/*Write a program that calculates and prints 
the sum of numbers from 1 to n, where n is input by the user 
*/
import java.util.Scanner;
class SumNumber
{
    public static void main(String arg[])
    {
        System.out.println("please enter value of n ");
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int sum = 0;
         for(int i=0;i<=n;i++)
    {
        sum = sum + i;
    }
        System.out.println("sum is" + sum );
    }
}