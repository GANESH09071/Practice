public class Robber 
{ 
    public int rob(int[] nums) 
    {
        int robMoney =0;
        int robMoney2=0;

        for(int i=0;i<nums.length;i++)
        {
            int maxMoney=Math.max(robMoney+nums[i],robMoney2);
            robMoney=robMoney2;
            robMoney2=maxMoney;
        }
        return robMoney2;
        
    }

    public static void main(String[] args) 
    {
        Robber obj = new Robber();
        int[] nums ={1,2,3,1};
        System.out.println(obj.rob(nums));
        
    }
}
    

