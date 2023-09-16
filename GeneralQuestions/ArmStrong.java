class Armstrong
{
    public static int count(int num)
    {
        int temp = num;
        int count=0;
        while(temp>0)
        {
            temp = temp/10;
            count++;
        }
    }
    public static int power(int num,int count)
    {
        int sumPower=0;
        int power=1;
        int rem=0;
            while(temp>0)
            {
                rem = temp%10;
                for(int i=1;i<count;i++)
                {
                    power *=rem;
                    temp=temp/10;
                    sumPower +=power;
                }
            }
        
    }
    public static void main( String arg[])
    {
        System.out.println("enter a number");
        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();
        System.out.println("armstrong number is" + armstrong(num));
        count(num);
    }

}