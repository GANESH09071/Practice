public class SumOfN
{
     static  int sumN(int n)
    {
        if(n==0)
        {
            return 0;
        }
        return n+sumN(n-1);

    }

    public static void main(String[] args)
    {
        int n =5;
        System.out.println(sumN(5));

    }
}