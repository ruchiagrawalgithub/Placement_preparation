//2.write a program to calculate min,max,sum and avg of a given array.
class MinMaxAvgSumOfArray
{
    public int min(int a[])
    {
        int min_number=a[0];

        for(int i=0;i<a.length;i++)
        {
            if(min_number>a[i])
            {
                min_number=a[i];
            }
        }
        
        return min_number;
    }
    public int max(int a[])
    {
        int max_number=a[0];
        for(int i=0;i<a.length;i++)
        {
            if(a[i]>max_number)
            {
                max_number=a[i];
            }
        }
        return max_number;
    }
    public int sum(int a[])
    {
        int sum=a[0];
        for(int i=0;i<=a.length-1;i++)
        {
            sum = sum+a[i];
        }
    return sum;
    }
    public int avg(int a[])
    {
        int sum = sum(a);
        int avg = sum(a)/a.length;
        return avg;
    }
    public static void main(String arg[])
    {
        Dsa2 dsa = new Dsa2();

        int a[]={15,20,25,8,30};
        int min=dsa.min(a);
        System.out.println(min);
        int max=dsa.max(a);
        System.out.println(max);
        int sum = dsa.sum(a);
        System.out.println(sum);
        int avg = dsa.avg(a);
        System.out.println(avg);
    }
}
