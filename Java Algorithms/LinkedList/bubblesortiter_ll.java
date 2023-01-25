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
	public static void swap(LinkedListNode<Integer> head) {
		int val = head.next.data ;
        head.next.data = head.data ;
        head.data = val ;
	}

	public static LinkedListNode<Integer> bubbleSort(LinkedListNode<Integer> head) {
		LinkedListNode<Integer> li = head; 
        while(li!= null){
            LinkedListNode<Integer> lii = head; 
            while(lii.next!= null){
                if(lii.data > lii.next.data){
                swap(lii) ;
            }
                lii = lii.next ;
        } li = li.next ;
	}
        return head ;
}
}