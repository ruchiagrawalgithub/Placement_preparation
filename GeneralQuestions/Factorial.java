// Write a program to calculate the factorial 
// of a given number n using a for loop. 

import java.util.Scanner;
class ForFactorial
{
    public static void main(String arg[])
    {
        System.out.println("enter n");
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int fac=1;
        for(int i=1;i<=n;i++)
        {
            fac = i*fac;
        }
        System.out.println(fac);
    }
}