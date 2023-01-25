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
    
     public static LinkedListNode<Integer> mergeTwoSortedLinkedLists(LinkedListNode<Integer> head1, LinkedListNode<Integer> head2) {
   
          if(head1 == null) {
              return head2 ;}
         else if(head2==null){
              return head1 ;
     }
         LinkedListNode<Integer> t1 = head1 ;
         LinkedListNode<Integer> t2 = head2 ;
         LinkedListNode<Integer> temp = null ;
           LinkedListNode<Integer> tester= null;
         if(t1.data >= t2.data){    
              temp = t2 ;
              tester = t2 ;
            t2  = t2.next ;
            
         }else {
             temp = t1 ;
              tester = t1 ;
              t1 = t1.next ;
         }
        
         while(t1 != null && t2 != null){
             if(t2.data >= t1.data){
                tester.next = t1 ;
                 tester  =t1 ;
                 t1 = t1.next ;
             }
             else{  tester.next = t2 ;
                  tester = t2 ;
                 t2 = t2.next ; 
                 
             }}
         if(t1 !=null){
             tester.next = t1 ;
         }
         else{
             tester.next = t2 ;
         }
     return temp ;}
 
 }