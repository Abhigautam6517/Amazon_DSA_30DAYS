import java.util.Arrays;

public class ThirdMaximumNumber {
    public static int thirdMax(int[] nums) {
        int n =nums.length;
        Arrays.sort(nums);
        
         int count=1;
         if(n<3)
         {
             return nums[n-1];
         }
         for(int i = n-2;i>= 0;i--){
             if(nums[i + 1] != nums[i])
             {
                 count++;
             }
             
             if(count == 3){
                 return nums[i];
             }
         }
         return nums[n-1];
 }
 public static void main(String[] args) {
    int nums[] = {5,4,2,5,3};
    System.out.println(thirdMax(nums));
 }
    
}
