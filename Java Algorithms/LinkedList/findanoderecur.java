public class findanoderecur {
     
}
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


	public static int findNodeRec(LinkedListNode<Integer> head, int n) {
        
           if(head==null){
            return -1 ;
        }
        
    	 if(head.data == n){
             return 0 ;
         }
     	int smallAns = findNodeRec(head.next, n) ;
        if(smallAns == -1) {
            return -1;
        }
        else{
            return 1 + smallAns ;
        }
        
	}

}