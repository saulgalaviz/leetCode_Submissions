package leetCode;

//Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.
public class MaximumSubarray_53 
{
	public static void main(String[] args) 
	{
		int[] nums = {6, -10, 2, -1, 2, 5, 1, -5, 4};
		System.out.println(maxSubArray(nums));
	}
	
	public static int maxSubArray(int[] nums) 
    {
        int maxSubArray = nums[0];
        int temp = nums[0];
        
        for(int counter = 1; counter < nums.length; counter++)
        {
        	if(temp < 0)
        		temp = nums[counter];
        	
        	else
        		temp += nums[counter];
        		
        	maxSubArray = Math.max(maxSubArray, temp);
        }
        
        return maxSubArray;
    }
}