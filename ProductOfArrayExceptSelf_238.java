package leetCode;

import java.util.Arrays;

public class ProductOfArrayExceptSelf_238 
{
	public static void main(String[] args) 
	{
		int[] nums = {2, 5, 3, 1};
		
		int[] numsProducts = productExceptSelf(nums);
		System.out.println(Arrays.toString(numsProducts));
	}
	
	 public static int[] productExceptSelf(int[] nums) 
	 {
		 int[] arrayProducts = new int[nums.length];
		 
		 int leftProduct = 1;
		 int rightProduct = 1;
		 Arrays.fill(arrayProducts, 1);
		 
		 for(int counter = 0; counter < nums.length; counter++)
		 {
			 arrayProducts[counter] *= leftProduct;
			 leftProduct *= nums[counter];
			 arrayProducts[nums.length - 1 - counter] *= rightProduct;
			 rightProduct *= nums[nums.length - 1 - counter];
		 }
		 
		 return arrayProducts;
	 }

}
