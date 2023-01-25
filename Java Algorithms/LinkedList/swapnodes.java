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

	public static LinkedListNode<Integer> swapNodes(LinkedListNode<Integer> head, int i, int j) {
		
        int count = 0 ;
        LinkedListNode<Integer> temp = head ;
      
        LinkedListNode<Integer> l1  = null; 
        LinkedListNode<Integer> l2  = null; 
                LinkedListNode<Integer> sample = null; 
                
        while(head!= null){
            if(count == i-1){
                l1 = head; 
            }
            if(count==j-1){
                l2 = head ;
            }
            head = head.next ;
            count ++ ;
        }
    	LinkedListNode<Integer> s2 = new LinkedListNode<>(l1.next.data) ; 
        LinkedListNode<Integer> s1 = new LinkedListNode<>(l2.next.data) ;
        head= temp ;
         count = 0 ;
            while(head.next!= null){
            if(count == i-1){
             //   System.out.println("eeg") ;
                sample = head.next.next ;
                head.next = s1 ;
                s1.next= sample;
            }
            if(count==j-1){
                //         System.out.println("eg") ;
               sample = head.next.next ;
                head.next = s2 ;
                s2.next= sample;
            }
            head = head.next ;
            count ++ ;
        }
        return temp ;
	}

}