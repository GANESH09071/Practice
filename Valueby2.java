import java.util.*;
class Valueby2 
{
    public int findFinalValue(int[] nums, int original) 
    {
    Arrays.sort(nums);
    for(int i=0;i<nums.length;i++)
    {
        if(nums[i]==original)
            original=nums[i]*2;
    }
    return original;    
    }

    public static void main(String[] args) {
        Valueby2 obj = new Valueby2();
        int[] nums = new int[]{5,3,6,1,12};
        int original=3;
        System.out.println(obj.findFinalValue(nums, original));
    }
}