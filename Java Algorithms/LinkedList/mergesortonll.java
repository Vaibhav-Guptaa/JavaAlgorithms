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
    
     public static  LinkedListNode<Integer> merge(LinkedListNode<Integer> head1 ,LinkedListNode<Integer> head2 ) { 
                        LinkedListNode newhead = null ; 
                     LinkedListNode temp = null; 
         //  if(head1 == null){
         //      return head2 ;
         //  }
         // if(head2== null){
         //     return head1 ;
         // }
                   if(head1.data> head2.data){
             
                       newhead = head2 ;
                        temp = newhead ;
                       head2  = head2.next ;
                   }
         else{
             newhead = head1 ;
              temp = newhead ;
            head1 = head1.next ;
         }
         
         while(head1 != null && head2  != null)
         {
             if(head1.data > head2.data) {
                  newhead.next  =   head2 ;
                 newhead = newhead.next ;
                 head2 = head2.next ;
             }
             else{
                  newhead.next  =   head1 ;
                 newhead = newhead.next ;
                 head1 = head1.next ;
             }
         }
         if(head1 == null){
             newhead.next = head2 ;
             
         }
         else{
             newhead.next = head1 ;
         }
         return temp ;
     }
     
 
      public static LinkedListNode<Integer> mergeSort(LinkedListNode<Integer> head) {
          if(head == null  || head.next == null){
              return head; 
          }
            LinkedListNode slow = head ;
         LinkedListNode fast = head ;
         while(fast.next != null && fast.next.next != null){
             fast = fast.next.next ;
             slow = slow.next ;
         }
           LinkedListNode sampe = slow.next  ;
         slow.next = null ;
        LinkedListNode newh = mergeSort(head) ;
        LinkedListNode newmidh = mergeSort(sampe) ;
       head  = merge(newh,newmidh) ;
         return head ;
      }
 
 }