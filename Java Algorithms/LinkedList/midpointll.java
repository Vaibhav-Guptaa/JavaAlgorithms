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
    
    
     public static LinkedListNode<Integer> midPoint(LinkedListNode<Integer> head) {
          LinkedListNode slowNode = head ;
          LinkedListNode fastNode =  head ;
         if(head == null){
             return null ;
         }
         while(fastNode.next != null && fastNode.next.next != null){
             slowNode = slowNode.next ;
             fastNode = fastNode.next.next ;
         }
         
         return slowNode ;
     }
 
 }