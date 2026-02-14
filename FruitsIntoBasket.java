import java.util.*;
class FruitsIntoBasket {
    public static int totalFruit(int[] fruits) 
    {
        Map<Integer,Integer> map = new HashMap<>();
        int left =0;
        int max =0;

        for(int right=0;right<fruits.length;right++)
        {
            map.put(fruits[right],map.getOrDefault(fruits[right],0)+1);

            while(map.size()>2)
            {
                map.put(fruits[left],map.getOrDefault(fruits[left],0)-1);
                if(map.get(fruits[left])==0)
                    map.remove(fruits[left]);
                left++;
            }
            max=Math.max(max,right-left+1);
        }
        return max;
    }
      public static void main(String[] args)
    {
        
        int[] nums = new int[] {1,2,1};
        int result =totalFruit(nums);
        System.out.println(result);
    }
}