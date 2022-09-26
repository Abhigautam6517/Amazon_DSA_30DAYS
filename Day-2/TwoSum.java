import java.util.HashMap;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        // int ans[] = new int[2];
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],i);
  
        }
          // Searching 
          for(int i=0;i<nums.length;i++){
            int find = target-nums[i];
              // ans[0] = i;
             if(map.containsKey(find)){
                 int index = map.get(find);
                
                 if(index==i) continue;
                 return new int[]{i,index};
  
             }
          
      }
      return new int[]{};
  }


    public static void main(String[] args) {
        int arr[] ={2,7,11,15};
        int target = 9;
        twoSum(arr, target);
        
    }
    
}
