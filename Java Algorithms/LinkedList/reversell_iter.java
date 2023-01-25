/*************** 
     * Following is the Node class already written 
            class LinkedListNode<T> {
                T data;
                LinkedListNode<T> next;

                public Node(T data) {
                    this.data = data;
                }
            }
 ***************/

 public class Solution {

	public static LinkedListNode<Integer> reverse_I(LinkedListNode<Integer> head){
        
       LinkedListNode prev = null  ;
       LinkedListNode curr = head ; 
        if(head ==null){
            return null ;
        }
        while(curr.next !=  null){
            LinkedListNode forw = curr.next ;
        curr.next = prev  ;
        prev = curr ;
        curr = forw ;
        }
        curr.next  =prev ;
        return curr ;
        
	}
}