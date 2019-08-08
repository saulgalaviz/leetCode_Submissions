package leetCode;

public class MaximumProductSubarray_152 
{

	public static void main(String[] args) 
	{
		int[] nums = {2, 3, -2, 4};
		
		System.out.println(maxProduct(nums));
	}
	
	public static int maxProduct(int[] nums) 
	{
		if(nums == null || nums.length == 0)
			return 0;
		
		int highestValue = nums[0];
        int maxProduct = nums[0];
        int minProduct = nums[0];
        int temp;
        
        for(int counter = 1; counter < nums.length; counter++)
        {
        	temp = maxProduct;
        	
        	maxProduct = Math.max(Math.max(maxProduct * nums[counter], minProduct * nums[counter]), nums[counter]);
        	minProduct = Math.min(Math.min(temp * nums[counter], minProduct * nums[counter]), nums[counter]);
        	highestValue = Math.max(maxProduct, highestValue);	
        }
        return highestValue;
    }
}