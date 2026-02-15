class MostOnes {
    
    public static void main(String[] args) 
    {
    int[] nums = new int[]{1,1,1,0,0,0,1,1,1,1,0};
    int k=2;
    System.out.println(longestOnes(nums,k));

    }
    public static int longestOnes(int[] nums, int k) 
    {
        int left =0;
        int countZero =0;
        int max =0;

        for(int right=0;right<nums.length;right++)
        {
            if(nums[right]==0)
            {
                countZero++;
            }

            while(countZero>k)
            {
                if(nums[left]==0)
                {
                    countZero--;
                }
                left++;
            }

             max= Math.max(max,right-left+1);
        }
        return max;
        
    }
}