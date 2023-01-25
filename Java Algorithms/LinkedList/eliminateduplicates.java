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

	public static LinkedListNode<Integer> removeDuplicates(LinkedListNode<Integer> head) {
        
         LinkedListNode<Integer> newhead = head ; 
         LinkedListNode<Integer> toreturn = newhead ;
          
		  while(newhead != null){
              LinkedListNode<Integer> temp = newhead ;
              
              while(temp !=null && temp.data.equals(newhead.data)){
                   temp = temp.next ; 
              }
                   newhead.next = temp  ;
            
              newhead = newhead.next ; 
          }

    return toreturn  ;}
}