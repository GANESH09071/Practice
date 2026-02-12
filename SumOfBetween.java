//Develop a Java program to find the sum between 'n' and 'm'
public class SumOfBetween
{
    static int sumBtw(int n ,int m)
    {
        if(n==m)
        {
            return m;
        }
        if(n<m)
        {
            return n + sumBtw(n+1, m);
        }else
            return n+sumBtw(n-1,m);

    }

    public static void main(String[] args)
    {
        int n=2;
        int m = 5;
        System.out.println(sumBtw(2,5));


    }
}