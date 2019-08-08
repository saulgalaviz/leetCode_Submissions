package leetCode;

//Suppose an array sorted in ascending order is rotated at some pivot unknown to you beforehand.
//(i.e.,  [0,1,2,4,5,6,7] might become  [4,5,6,7,0,1,2]).
//Find the minimum element.
public class FindMinInRotatedSortedArray_153 {

	public static void main(String[] args) 
	{
		int[] nums = {5, 6, 9, 2, 4};
		
		System.out.println(findMin(nums));

	}
	public static int findMin(int[] nums) {
        int least = Integer.MAX_VALUE;
        for(int counter = 0; counter < nums.length; counter++)
        {
            least = Math.min(least, nums[counter]);
        }
        return least;
    }

}
