package LeetCode;

public class ImplementstrStr 
{

	public static void main(String[] args) 
	{
		System.out.println(strStr("abaa", "baaa"));
	}
	
	public static int strStr(String haystack, String needle) 
	{
        if(needle.equals(""))
        	return 0;
        
        int index = -1;
        if(haystack.length() == needle.length())
        {
        	for(int counter = 0; counter < haystack.length(); counter++)
            {
            	String formulation = "";
            	
            	if(haystack.charAt(counter) == (needle.charAt(0)))
            	{
    	        	for(int counter2 = counter; counter2 < haystack.length(); counter2++)
    	        	{
    	        		formulation = formulation + haystack.charAt(counter2);
    	        		if(formulation.equals(needle))
    	        			return counter;
    	        	}
            	}
            }
        }
        
        else
        {
	        for(int counter = 0; counter < haystack.length() - needle.length(); counter++)
	        {
	        	String formulation = "";
	        	
	        	if(haystack.charAt(counter) == (needle.charAt(0)))
	        	{
		        	for(int counter2 = counter; counter2 < haystack.length(); counter2++)
		        	{
		        		formulation = formulation + haystack.charAt(counter2);
		        		if(formulation.equals(needle))
		        			return counter;
		        	}
	        	}
	        }
        }
        return index;
    }

}
