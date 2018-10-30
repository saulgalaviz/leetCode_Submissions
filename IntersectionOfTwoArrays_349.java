package LeetCode; //Done

import java.util.HashMap;
import java.util.ArrayList;

public class IntersectionOfTwoArrays_349 {

	public static void main(String[] args) {
		int[] arr = intersection(new int[] {2,5,5,2}, new int[] {3,4,5,2});
		
		for(int x = 0; x < arr.length; x++)
		{
			System.out.print(arr[x] + " ");
		}
	}
	
	public static int[] intersection(int[] nums1, int[] nums2)
	{
		HashMap<Integer, Integer> map = new HashMap<>();
		ArrayList<Integer> arr = new ArrayList<>();
		
		for(int counter = 0; counter < nums1.length; counter++)
		{
			if(!(map.containsKey(nums1[counter])))
				map.put(nums1[counter], counter);
		}
		
		for(int counter = 0; counter < nums2.length; counter++)
		{
			if(map.containsKey(nums2[counter]) && !arr.contains(nums2[counter]))
				arr.add(nums2[counter]);
		}
		
		int[] values = new int[arr.size()];
		
		for(int counter = 0; counter < values.length; counter++)
			values[counter] = arr.get(counter).intValue();
		
		return values;
	}

}
