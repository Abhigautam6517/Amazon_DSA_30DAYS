

public class ContainerWithWater {
    public static int maxArea(int[] height) {
        int max = -1;
        int i = 0;
        int j = height.length - 1;
        while (i != j) {
            int total = (j - i) * Math.min(height[i], height[j]);
            if (max < total) {
                max = total;
            }
            if (height[i] > height[j])
                j--;
            else
                i++;
        }
        return max;
    }
    public static void main(String[] args) {
        int height[] = {1,8,6,2,5,4,8,3,7};
        maxArea(height);
        
    }
    
}
