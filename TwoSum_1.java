package LeetCode; //Done

import java.util.HashMap;

public class TwoSum_1 
{
   public static int[] twoSum(int[] nums, int target) 
   {
        HashMap<Integer, Integer> map = new HashMap<>();       
        for (int i = 0; i < nums.length; i++)
        {
            map.put(nums[i], i);
        }       
        for (int i = 0; i < nums.length; i++)
        {
            int necessary = target - nums[i];           
            if(map.containsKey(necessary) && i != map.get(necessary))
                return new int[] {map.get(necessary), i};
        }    
        throw new IllegalArgumentException("No values add up to target");
   }
//       for(int i = 0; i < nums.length; i++)
//       {
//           for(int y = 0; y < nums.length; y++)
//           {
//               if((nums[i] + nums[y] == target) && i != y)
//               {
//                   int[] ans = {i, y};
//                   return ans;
//               }
//           }
//       }
//       return nums;
}
