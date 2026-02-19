public class MaxSubArray 
{
    public int maxSubArray(int[] nums) 
    {
        int sum = nums[0];
        int maxSum = nums[0];

        for(int i=1;i<nums.length;i++)
        {
            sum = Math.max(nums[i],sum+nums[i]);
            maxSum = Math.max(sum,maxSum);
        }
        return maxSum;
        
    }

    public static void main(String[] args)
    {
        MaxSubArray obj = new MaxSubArray();
        int[] nums= new int[] {5,4,-1,7,8};
        System.out.println(obj.maxSubArray(nums));
    }

    
}
