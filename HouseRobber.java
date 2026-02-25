public class HouseRobber
{
    public int rob(int[] nums) 
    {
        int n = nums.length; 
        if (n == 1) return nums[0];
        
        return Math.max(robber(nums, 0, n - 2),robber(nums, 1, n - 1));
    }
    
    private int robber(int[] nums, int start, int end) {
        int prev1 = 0;  
        int prev2 = 0;  
        
        for (int i = start; i <= end; i++) {
            int pick = nums[i] + prev2;
            int notPick = prev1;
            
            int current = Math.max(pick, notPick);
            
            prev2 = prev1;
            prev1 = current;
        }
        
        return prev1;
    }
    public static void main(String[] args) {
       HouseRobber obj = new HouseRobber();
       int[] nums = new int[]{1,2,3,1};
       System.out.println(obj.rob(nums));
    }

}
  

    

