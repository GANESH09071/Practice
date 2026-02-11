public class Problem {
    public int findPeakElement(int[] nums) {
        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int mid = (left + right) / 2;

            if (nums[mid] > nums[mid + 1])
                right = mid;
            else
                left = mid + 1;
        }
        return right;   
    }
}

public class Main {
    public static void main(String[] args) {
        Problem obj = new Problem();


        int[] nums = {1, 2, 3, 1};

        int peakIndex = obj.findPeakElement(nums);

        System.out.println("Peak index = " + peakIndex);
        System.out.println("Peak value = " + nums[peakIndex]);
    }
}
