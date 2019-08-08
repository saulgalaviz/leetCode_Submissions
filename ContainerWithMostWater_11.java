package leetCode;

public class ContainerWithMostWater_11 
{

	public static void main(String[] args) 
	{
		int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};
		
		System.out.println(maxArea(height));
	}
	
	public static int maxArea(int[] height) 
	{
        int maxArea = 0;
        int left = 0, right = height.length - 1;
        
        while(left < right)
        {
        	maxArea = Math.max(maxArea, Math.min(height[left], height[right]) * (right - left));
        	
        	if(height[left] < height[right])
        		left++;
        	
        	else
        		right--;
        }
        
        return maxArea;
    }

}
