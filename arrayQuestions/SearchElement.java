//5.write a program to search for a element in a array.
class SearchElement 
{
    public int searchedElement(int a[],int element)
    {   int i=0;
        if(a[i]==element)
        {
            System.out.print(a[i]);
        }
        return element;
    }
    public static void main(String arg[])
    {
        Dsa5 dsa = new Dsa5();
        int a[]={1,2,3,4,5};
        int requiredElement=dsa.searchedElement(a,2);
        System.out.println(requiredElement);

    }
}
