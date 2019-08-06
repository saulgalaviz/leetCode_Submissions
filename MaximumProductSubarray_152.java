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
        int maxProduct = 0;
        int tempProduct = 0;
        boolean emptyVar = true;
        int tempNum = 0;
        
        for(int counter = 0; counter < nums.length; counter++)
        {
        	tempProduct = maxProduct;
        	if(emptyVar)
        	{
        		tempNum = nums[counter];	
        		emptyVar = false;
        	}
        	
        	else if(tempProduct < tempProduct * nums[counter])
        	{
        		tempProduct *= nums[counter];
        	}
        	
        	else if(!emptyVar)
        	{
        		tempProduct = nums[counter] * tempNum;
        		emptyVar = true;
        	}
        		
        	maxProduct = Math.max(tempProduct, maxProduct);
        }
        
        return maxProduct;
    }

}
