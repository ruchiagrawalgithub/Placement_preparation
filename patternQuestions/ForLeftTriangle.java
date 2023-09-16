
//     *
//    **
//   ***
//  ****
// *****

import java.util.Scanner;
class ForLeftTriangle
{
    public static void main(String arg[])
    {  
        System.out.println("Please enter a number");
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        for(int i=1;i<=n; i++)
        {
            for(int j=1; j<=n;j++)
            {
                if(n-i>=j)
                {
                System.out.print(" ");
                }
                else
                {
                System.out.print("*");
                }

            }
            System.out.println("");
        }
    }
}