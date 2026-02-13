import java.util.*;
class MajorityElement2 {
    public static List<Integer> majorityElement(int[] nums) 
    {
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int num:nums)
        {
            map.put(num,map.getOrDefault(num,0)+1);
        } 

        List<Integer> result = new ArrayList<>();
        int n=nums.length;

        for(int key:map.keySet())
        {
            if(map.get(key)>n/3)
                result.add(key);
        }
        return result;     
        
    }
    public static void main(String[] args)
    {
        
        int[] nums ={3,2,3};
        List<Integer> ans = majorityElement(nums);
        System.out.println(ans);
    }
}