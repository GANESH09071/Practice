import java.util.Arrays;

public class SortIndices 
{
    public int[] sortEvenOdd(int[] nums) {
        
        for(int i = 1;i<nums.length;i+=2){
            for(int j = 1;j<nums.length-2;j+=2){
                if(nums[j] < nums[j+2] ){
                    int temp = nums[j];
                    nums[j] = nums[j+2];
                    nums[j+2] = temp;
                }
            }
        }
        
        for(int i = 0;i< nums.length-1;i+=2){
            for(int j = 0;j<nums.length-2;j+=2){
                if(nums[j] > nums[j+2] ){
                    int temp = nums[j];
                    nums[j] = nums[j+2];
                    nums[j+2] = temp;
                }
            }
        }
       
        return nums;
    }

    public static void main(String[] args) {
        SortIndices obj = new SortIndices();
        int[] nums = new int[]{4,1,2,3};
        int[] result=obj.sortEvenOdd(nums);
        System.out.println(Arrays.toString(result));
    }
}
    

