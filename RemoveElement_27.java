package LeetCode; //Done

public class RemoveElement_27 
{

	public static void main(String[] args) 
	{
		System.out.println(removeElement(new int[] {5,4,2,3,5}, 5));
	}

	public static int removeElement(int[] nums, int val)
	{	
		int count = 0;
		
		for(int counter = 0; counter < nums.length; counter++)
		{
			if(val != nums[counter])
			{
				nums[count] = nums[counter];
				count++;
			}
		}
		return count;
	}
}
