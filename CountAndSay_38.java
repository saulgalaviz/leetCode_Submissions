package LeetCode;

import java.lang.*;

public class CountAndSay_38 {

	static StringBuilder overall = new StringBuilder("");
	
	public static void main(String[] args)
	{
		System.out.println(countAndSay(1));
	}
	
	public static String countAndSay(int n)
	{
		StringBuilder current = new StringBuilder("1");
		
		if(n == 1)
			return "1";
		
		else 
		{
			n -= 1;
			
			
			
			String prefix = "";
			
			//for(int counter = 0; counter < )
			
			return "1" + countAndSay(n);
		}
	}
}
