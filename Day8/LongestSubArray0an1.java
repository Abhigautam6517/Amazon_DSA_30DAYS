package Day8;

import java.util.HashMap;

public class LongestSubArray0an1 { int maxLen(int arr[], int n)
    {
         HashMap<Integer, Integer> map = new HashMap<>();
         map.put(0,-1); 
         int sum = 0, maxLength = 0;
         for(int i = 0; i < n; i++){
             if(arr[i] == 0)
                 sum -= 1;
             else if(arr[i]==1){
                 sum += 1;
             }
             if(map.containsKey(sum)){
                 int index = map.get(sum);
                 int len = i-index;
                   maxLength = Math.max(len, maxLength);
             }
             else{
                 map.put(sum, i);
             }
         }
         return maxLength;
     }
}
