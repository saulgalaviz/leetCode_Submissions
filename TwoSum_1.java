package leetCode;

import java.util.HashMap;
import java.util.Map;

public class TwoSum_1 
{
	public static void main(String[] args)
	{
		int[] nums = {15, 5, 16, 8, 9, 12};
		int target = 13;
		
		int[] results = twoSum(nums, target);
		
		System.out.println(results[0] + " " + results[1]);
	}
	
	public static int[] twoSum(int[] nums, int target) 
	{
		Map<Integer, Integer> map = new HashMap<>(); 
		
		for (int counter = 0; counter < nums.length; counter++)
		{
			int necessary = target - nums[counter];
			if(map.containsKey(necessary))
				return new int[] {map.get(necessary), counter};
			
			map.put(nums[counter], counter);
		}
		throw new IllegalArgumentException("No values add up to target");
	}
}
