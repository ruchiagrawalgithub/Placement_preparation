class Pattern8
{
    /*
    if(i=n-1/2)
if(j=n-1/2)
if(i=j)
if(i=n-j)
*/
    public static void main(String arg[])
    {
        int n = 5;
        for(int i=0; i<=n-1;i++)
        {
            for(int j=0; j<=n-1;j++)
            {
                if(i==(n-1)/2)
                {
                    System.out.print("*");
                }
                else if(j==(n-1)/2)
                {
                    System.out.print("*");
                }
                else if(i==j && i!=0 && i!=n-1)
                {
                    System.out.print("*");
                } else if(j==n-i)
                {
                    System.out.print("*");
                }
               
                else
                {
                    System.out.print("_");
                }
            }
            System.out.println();

        }
    }
}