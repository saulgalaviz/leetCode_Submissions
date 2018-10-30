package LeetCode; //Done

import java.util.HashMap;

public class RemoveDuplicates_26 {

	public static void main(String[] args) {
		

	}

	public static int removeDuplicates(int[] nums) {
		HashMap<Integer, Integer> map = new HashMap<>();
        
        int index = 0;
        for(int counter = 0; counter < nums.length; counter++)
        {
        	if(!(map.containsValue(nums[counter])))
        	{
                nums[index] = nums[counter];
        		map.put(index, nums[counter]);
        		
        		index++;
        	}
        }
        return index;
    }
}
