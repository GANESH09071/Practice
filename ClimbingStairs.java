public class ClimbingStairs 
{
    public int climbStairs(int n) 
    {
        if(n<=2)
            return n;

        int top=0;
        int first =1;
        int second =2;

        for(int i=3;i<=n;i++)
        {
            top = first + second;
            first=second;
            second=top;
        }
        return top;    
    }
    public static void main(String[] args) {
        ClimbingStairs obj = new ClimbingStairs();
        int n =6;
        System.out.println(obj.climbStairs(n));
    }
}
