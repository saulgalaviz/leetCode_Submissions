package leetCode;

public class BestTimeToBuyAndSellStock_121 
{
	public static void main(String[] args) 
	{
		int[] prices = {15, 2, 1, 5, 7, 1, 10, 12, 2, 12};
		
		System.out.println(maxProfit(prices));
	}
	
	public static int maxProfit(int[] prices) 
	{
        int maxProfit = 0;
        int leastVal = Integer.MAX_VALUE;
        
        for(int counter = 0; counter < prices.length; counter++)
        {
        	if(leastVal > prices[counter])
        		leastVal = prices[counter];
        	
        	else if(maxProfit < prices[counter] - leastVal)
        		maxProfit = prices[counter] - leastVal;
        }
        
        return maxProfit;
    }

}
