package Day8;

import java.util.Arrays;

public class MinimunPlatform {
    static int findPlatform(int arr[], int dep[], int n)
    {
        // add your code here
        Arrays.sort(arr);
        Arrays.sort(dep);
        int max = 0;
        int count = 0;
        int i=0,j=0;
        while(i<n){
            if(arr[i]<=dep[j]){
                count++;
                max=Math.max(max,count);
                i++;
            }
             else if(arr[i]>dep[j]){
                count--;
                j++;
            }
        }
        return max;
        
    }
    
}
