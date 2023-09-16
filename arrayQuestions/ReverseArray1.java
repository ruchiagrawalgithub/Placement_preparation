//6.write a program to reverse a array.
class ReverseArray
{
   public int[] reverseArray(int[] a)
    {
        System.out.println("actual array is:");
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }
        System.out.println();
        int[] a2 =new int[a.length];
        System.out.println("reversed array is:");
        for(int i=a.length-1;i>=0;i--)
        {
            a2[i]= a[i];
            System.out.print( a2[i] + " ");
        }
        return a2;
    }
    public static void main(String arg[])
    {
        Dsa6 dsa = new Dsa6();
        int[] a={10,20,30,40,50,60};
        int[] reverseArr=dsa.reverseArray(a);      
    }        
}
