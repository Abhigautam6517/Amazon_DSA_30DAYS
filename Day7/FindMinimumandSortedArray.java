package Day7;

import java.util.Arrays;

public class FindMinimumandSortedArray {
    public int findMin(int[] nums) {
        Arrays.sort(nums);
        return nums[0];
        
    }
    
}
