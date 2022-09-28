import java.util.Arrays;

public class FirstPostiveMissing {
    public static int firstMissingPositive(int[] nums) {
        Arrays.sort(nums);
               
        int missing = 1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == missing) {
                missing++;
            }
        }
        return missing; 
    }    
    public static void main(String[] args) {
        int arr[] = {3,4,-1,1};
        System.out.println(firstMissingPositive(arr));
        
        
    }
}
