package leetCode;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate_217 {

	public static void main(String[] args) 
	{
		int[] nums = {15, 154, 2, 1, 15, 152, 56, 12, 51};
		
		System.out.println(containsDuplicate(nums));
	}
	
	public static boolean containsDuplicate(int[] nums) 
	{
		Set<Integer> set = new HashSet<>();
		
		for(int counter = 0; counter < nums.length; counter++)
		{
			if(set.contains(nums[counter]))
				return true;
			
			set.add(nums[counter]);
		}
		
		return false;
    }
}
