import java.util.Scanner;
class ForRightTriangle
{
    public static void main(String arg[])
    {
        System.out.println("please enter the value of num");
        Scanner sc = new Scanner(System.in);
       int num = sc.nextInt();
        for(int i=0;i < num;i++)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print("*");
            }
                System.out.println(" ");
        }
    }
}

//         int row=6;
// for(int i=0; i<row; i++)   
// {   
// for(int j=0; j<=i; j++)   
// {   
// System.out.print("* ");   
// }   
// System.out.println();   
//         }       
//     }
// }