import java.util.*;
public class ClosestSum 
{
    public int threeSum(int[] nums,int target)
    {
        Arrays.sort(nums);
        int nearestSum = nums[0]+nums[1]+nums[2];

        for(int i=0;i<nums.length-2;i++)
        {
            int left=i+1;
            int right=nums.length-1;
            
            while(left < right) {
                
                int currentSum = nums[i] + nums[left] + nums[right];
                
                if(Math.abs(currentSum - target) < Math.abs(nearestSum - target)) {
                    nearestSum= currentSum;
                }
                
                if(currentSum < target) 
                    left++;
                 else if(currentSum > target) 
                    right--;
                else 
                   return currentSum; 
            }
        }
        return nearestSum; 
  
    }

    public static void main(String[] args) 
    {
        ClosestSum obj = new ClosestSum();
        int[] nums = {-1,2,1,-4};
        int target=1;
        System.out.println(obj.threeSum(nums, target));
        
    }
    
}
