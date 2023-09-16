//1.write a program to calculate GCD(greatest commmon divisor)

class Gcd
{
    public int greatest_cd(int x, int y)
    {   
        int gcd=1;
        for(int i=1;i<=x && i<=y;i++)
        {
            if(x%i==0 && y%i==0)
            {
                gcd=i;
            }
        }

        return gcd;
    }
    public static void main(String arg[])
    {
        Dsa dsa = new Dsa();
        int divisor=dsa.greatest_cd(30,75);
        System.out.println(divisor);
    }
}
