public class CountN 
{
    static void countDownX(int n)
    {
        if(n<1)
        {
            return ;
        }
        
        System.out.println(n);
        countDownX(n-1);


    }
    public static void main(String[] args)
    {
        //int n =5;
        countDownX(5);
    }
    
}
