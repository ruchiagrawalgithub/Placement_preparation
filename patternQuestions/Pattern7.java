   /*
    *
   **
  ***
 ****
*****
*/


class Pattern7
{
    public static void main(String arg[])
    {
        int n=5;
        for(int i=0;i<=n-1;i++)
        {
            for(int j=0;j<=n-1;j++)
            {
                if(i>j)
                {
                    System.out.print(" ");
                }
                else
                {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}