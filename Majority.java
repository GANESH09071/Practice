public class Majority
{
    public static void main(String[] args) 
    {
        Majority obj = new Majority();

        int[] nums = {3, 2, 3, 1, 3}; 

        int majorElement = obj.majorityElement(nums);
        System.out.println("Majority Element: " + majorElement);
    }

    public int majorityElement(int[] nums) 
    {
        int count = 0;
        int candidate = 0;

        for (int num : nums) 
        {
            if (count == 0) 
            {
                candidate = num;
            }
            if(num==candidate)
                count++;
            else
                count--;
        }
        
        return candidate;
    }
}
