/*
* 
** 
*** 
**** 
*****
*/

class Pattern4
{
    public static void main(String[]arg)
    {
        int n=5;
        for(int i=0;i<=n-1;i++)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}