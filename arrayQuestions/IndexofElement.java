//7.write a program to find index of a element of a array.

class IndexofElement{
    public int indexOfArray(int[] a,int d){
        int i;
        for(i=0;i<a.length;i++){
            //System.out.print(a[i]);
            if(a[i] == d)
            {
                System.out.print(i);
            }
        }
        return i;
    }
    public static void main(String arg[])
    {
        Dsa7 dsa = new Dsa7();
        int[] a= {10,20,30,40,50,60};
        //int d=50;
        int indexno =dsa.indexOfArray(a,20);
        System.out.println(indexno);
    }
}
