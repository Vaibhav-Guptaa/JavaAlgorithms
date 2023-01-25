/****************************************************************

	Following is the Node class already written for the Linked List

	class LinkedListNode<T> {
    	T data;
    	LinkedListNode<T> next;
    
    	public LinkedListNode(T data) {
        	this.data = data;
    	}
	}

*****************************************************************/

public class Solution {
	public static LinkedListNode<Integer> deleteNode(LinkedListNode<Integer> head, int pos) {
		
         
        LinkedListNode<Integer> temp = head ;
        if(head == null){
             return null ;
         }
        int i = 0 ;
        if(pos==0){
            return head.next ;
        }
        while(i < pos-1 && temp.next != null){
             temp = temp.next;
        i++ ;
        } 
        if(temp.next != null){
        temp.next = temp.next.next ;
        }
       
        return head ;
    }
}
