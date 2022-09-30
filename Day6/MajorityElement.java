package Day6;

import java.util.Arrays;

public class MajorityElement {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int total = nums[nums.length/2];
        return total;
        
    }
    
}
