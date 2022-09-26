public class TrapingWater {
    public int trap(int[] height) {
        int leftmax=0;
        int rightmax=0;
        
        int len=height.length;
        int si=0;
        int ei=len-1;
        int result=0;
        
        while(si<=ei)
        {
            if(height[si]<=height[ei])
            {
                if(leftmax<=height[si])
                {
                    leftmax=height[si];
                    
                }
                else{
                    result+=leftmax-height[si];
                }
                si++;
            }else{
                if(rightmax<=height[ei])
                {
                    rightmax=height[ei];
                    
                }else{
                    result+=rightmax-height[ei];
                    
                }
                ei--;
            }
            
        }
        return result;
    }
    
    
}
