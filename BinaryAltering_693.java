package LeetCode; //Done

public class BinaryAltering_693 {

	public static void main(String[] args) 
	{

	}
	
	public static boolean hasAlteringBits(int n)
	{
		String bool = Integer.toBinaryString(n);
		
		char value = ' ';
		for(int counter = 0; counter < bool.length(); counter++)
		{
			if(value != ' ' && value == bool.charAt(counter))
				return false;
			
			else
				value = bool.charAt(counter);
		}
		return true;
	}
}
