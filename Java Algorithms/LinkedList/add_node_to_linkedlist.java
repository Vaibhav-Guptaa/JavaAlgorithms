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

	public static LinkedListNode<Integer> insert(LinkedListNode<Integer> head, int pos, int data){
        LinkedListNode<Integer> cn = new LinkedListNode<>(data) ;
      
    if(pos==0){
        cn.next = head ;
        return cn;
        
    }
        int i =0  ;
         LinkedListNode<Integer> temp ;
          temp = head ;
        
        while(i++ < pos-1 ){
            temp = temp.next ;
            if(temp == null){
               return head ; 
            }
            
        }
     
          
        
         cn.next = temp.next ;
        temp.next = cn ;
        
       return head;
    }
    
	}
