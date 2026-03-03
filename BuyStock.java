public class BuyStock 
{
    public int stock (int[] nums)
    {
        int profit=0;
        int maxProfit =0;

        for(int i=0;i<nums.length;i++)
        {
            for(int j=i+1;j<nums.length;j++)
            {
                profit = nums[j]-nums[i];
                maxProfit=Math.max(profit,maxProfit);
            }
        }
        return maxProfit;
    }

    public static void main(String[] args) 
    {
        BuyStock obj = new BuyStock();
        int[] nums = {7,1,5,3,6,9};
        System.out.println(obj.stock(nums));
        
    }
    
}
