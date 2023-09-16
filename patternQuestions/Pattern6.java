/*
    *
   **
  ***
 ****
*****
*/


class Pattern6
{
    public static void main(String arg[])
    {
        int n=5;
        for(int i=0;i<=n-1;i++)
        {
            for(int j=0;j<=n-1;j++)
            {
                if(j>=n-i-1)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}