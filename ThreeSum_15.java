package leetCode;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class ThreeSum_15 
{
	public static void main(String[] args) 
	{
		
		
	}
	
	public List<List<Integer>> threeSum(int[] nums) 
	{
		Arrays.sort(nums);
		
        List<List<Integer>> sums = new ArrayList<>();
        
        if(nums.length == 3 && nums[0] + nums[1] + nums[2] == 0)
        	sums.add(Arrays.asList(nums[0], nums[1], nums[2]));
        	
        for(int counter = 0; counter < nums.length - 3; counter++)
        {
        	if(counter == 0 || nums[counter] > nums[counter - 1])
        	{
        		int start = counter + 1;
        		int end = nums.length - 1;
        		
        		while(start < end)
        		{
        			if(nums[counter] + nums[start] + nums[end] == 0)
        				sums.add(Arrays.asList(nums[counter], nums[start], nums[end]));
        			
        			if(nums[counter] + nums[start] + nums[end] < 0)
        			{
        				int currentStart = start;
        				while(nums[start] == nums[currentStart] && start < end)
        					start++;
        			}
        			
        			else
        			{
        				int currentEnd = end;
        				while(nums[end] == nums[currentEnd] && start < end)
        					end--;
        			}
        		}
        	}
        }
        
        return sums;
    }

}
