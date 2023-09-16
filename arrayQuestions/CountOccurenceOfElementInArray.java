//4.write a program to find count of occurence of a no in a array.
class CountOccurenceOfElementInArray
{
    public int counter(int a[],int d)
    {   int count = 0;
        for(int i=0;i<a.length;i++)
        {
            if(a[i]==d)
            {
                count++;
            }
        }
        return count;
    }
    public static void main(String arg[])
    {
        Dsa4 dsa = new Dsa4();
        int a[]={15,5,2,5,4,5};
        int count=dsa.counter(a,7);
        System.out.println(count);
    }
}
