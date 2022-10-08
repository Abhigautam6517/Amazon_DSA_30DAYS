package Day13;

import java.util.Arrays;

public class KlargestNumber {
    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums); 
        int a=nums.length; 
        return nums[a-k];
    }
    
}
