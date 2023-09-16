class Dsa1
{
    public static int counter(int d, int n)
    {
      int count=0;
      while(n>0)
      {
        if(n%10==d)
        {
          n=n/10;
          count++;
        }
        else 
        {
           n=n/10;
        }    
      }
      return count;  
    }
	public static void main(String arg[])
    {
    //   Dsa1 dsa = new Dsa1();
    //   int c=dsa.counter(0,00);

      System.out.println(counter(5,454565));
    }
}