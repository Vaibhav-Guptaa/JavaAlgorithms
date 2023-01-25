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

	public static void printReverse(LinkedListNode<Integer> root) {
         if(root == null){
             return ;
         }
		 LinkedListNode<Integer> temp12 = root.next ;
        LinkedListNode<Integer> temp123 = root ;
         LinkedListNode<Integer> temp1 = root ;
        LinkedListNode<Integer> temp = root.next ;
         
        while(temp12 != null){
              temp123 = temp12 ;
            temp12 = temp.next ;
          
           temp.next = temp1  ;
            temp1 = temp123 ;
            temp = temp12 ;
        }
        root.next = null ;
         LinkedListNode<Integer> temp2 = temp1 ;
        while(temp2!=null){
            System.out.print(temp2.data+" ") ;
            temp2= temp2.next ;
        }
        
	}

}