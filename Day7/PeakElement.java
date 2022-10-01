package Day7;

public class PeakElement {
    public int findPeakElement(int[] nums) {
        int key =nums[0];
        int max = 0;
        int n = nums.length;
        for(int i =0;i<n;i++){
            if(key<nums[i]){
                key=nums[i];
                max=i;

            }
           

        }
         return max;
        
    }
    
}
