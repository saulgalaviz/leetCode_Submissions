package LeetCode; //Done

public class MergeTwoSortedLists_21 
{
	private static ListNode l1;
	private static ListNode l2;
	
	public static void main(String[] args)
	{
		l1 = new ListNode(3);
		l1.next = new ListNode(6);
		l1.next.next = new ListNode(8);
		
		l2 = new ListNode(4);
		l2.next = new ListNode(5);
		l2.next.next = new ListNode(6);
		
		ListNode list = mergeTwoLists(l1, l2);
		
		
		System.out.println(list.val);
	}
	
	public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		ListNode mergedList = null;
        
		if(l1 != null && l2 == null)
			return l1;
		
		else if(l1 == null && l2 != null)
			return l2;
		
		else if(l1 != null && l2 != null && l1.val <= l2.val)
		{
            mergedList = new ListNode(l1.val);
            l1 = l1.next;
		}
        
        else if(l1 != null && l2 != null && l1.val > l2.val)
        {
            mergedList = new ListNode(l2.val);
            l2 = l2.next;
        }
        
		ListNode list = mergedList;
		
	    while(l1 != null && l2 != null)
	    {
	    	if(l1.val <= l2.val)
	    	{
	    		list.next = l1;
	    		l1 = l1.next;
	    	}
	    	else
	    	{
	    		list.next = l2;
	    		l2 = l2.next;		
	    	}
	    	
	    	list = list.next;
	    }
	    
	    if(l1 != null)
	    	list.next = l1;
	    
	    else if(l2 != null)
	    	list.next = l2;
	    
	    return mergedList;
	}
	
	public static class ListNode
	{	
		int val;
		ListNode next;
		
		ListNode(int x)
		{
			val = x;
		}
	}
}
