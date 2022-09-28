

public class MaxSubArrayProduct {
    public int maxProduct(int[] nums) {
        int max=nums[0];
        int min=nums[0];
        int res=nums[0];
        for(int i=1;i<nums.length;i++){
            int temp=max;
            max=Math.max(Math.max(min*nums[i],max*nums[i]),nums[i]);
            min=Math.min(Math.min(min*nums[i],temp*nums[i]),nums[i]);
            res=Math.max(max,res);
        }
        return res;
    }
    
}
