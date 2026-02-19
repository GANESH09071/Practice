public class DuplicateNum 
{
    public int findDuplicate(int[] nums)
    {
     int slow = nums[0];
        int fast = nums[0];

        while(true)
        {
            slow = nums[slow];
            fast = nums[nums[fast]];

            if(slow==fast)
            {
                break;
            }
        }
        slow = nums[0];
        while(slow!=fast)
        {
            slow = nums[slow];
            fast =nums[fast];
        }
        return slow;
    
    }
    public static void main(String[] args) 
    {
        DuplicateNum obj = new DuplicateNum();
        int[] nums = new int[] {1,3,4,2,2};
        System.out.println(obj.findDuplicate(nums));
        
    }
}
