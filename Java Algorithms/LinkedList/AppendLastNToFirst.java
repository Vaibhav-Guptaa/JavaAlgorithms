/*

	Following is the Node class already written for the Linked List

	class LinkedListNode<T> {
    	T data;
    	LinkedListNode<T> next;
    
    	public LinkedListNode(T data) {
        	this.data = data;
    	}
	}

*/

public class Solution {

	public static LinkedListNode<Integer> appendLastNToFirst(LinkedListNode<Integer> head, int n) {
	   LinkedListNode<Integer> temp = head ;
        LinkedListNode<Integer> temp1;
         int last = 1 ;
        if(head == null){
            return null ;
        }
        while(temp.next != null){  last++ ;
            temp  = temp.next  ;
        } 
        temp.next = head ;
        temp = head ;
        
            int remain = last - n - 1  ;
        while(remain-->0){  
            temp = temp.next ;
            
        }    
        temp1 = temp.next ;
        temp.next = null ;
        
        return temp1 ;
        
        
        
        
	}

}