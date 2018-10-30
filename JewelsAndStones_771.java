package LeetCode; //Done

import java.util.HashMap;

public class JewelsAndStones_771 
{
	public static void main(String[] args) 
	{
		System.out.println(numJewelIsInStones("aA", "aaANBN"));
	}

	public static int numJewelIsInStones(String J, String S)
	{
		HashMap<Character, Integer> map = new HashMap<>();
		
		for(int counter = 0; counter < J.length(); counter++)
		{
			map.put(J.charAt(counter), counter);
		}
		
		int count = 0;
		
		for(int counter = 0; counter < S.length(); counter++)
		{
			if(map.containsKey(S.charAt(counter)))
				count++;
		}
		
		return count;
	}
}
