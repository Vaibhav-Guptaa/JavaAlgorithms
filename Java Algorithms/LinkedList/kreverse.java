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
class pair{
     LinkedListNode<Integer> start = null;
     LinkedListNode<Integer> end = null;
         
 }
 public class Solution {
      public static pair rev(LinkedListNode<Integer> head) {
           pair obj = new pair() ;
          if(head == null){
             return obj ;
         }
          if(head.next == null){
             obj.start = head ;
             obj.end = head ;
             return obj ;
         }
        LinkedListNode<Integer> temp = head.next  ;
         head.next = null ;
            LinkedListNode<Integer> temp1  =  rev(temp).start ;
            temp.next = head ;
       
         obj.start = temp1;
         obj.end = head ;
         return obj ;
     }
 
      public static LinkedListNode<Integer> kReverse(LinkedListNode<Integer> head, int k) {
              if(head == null){
            
             return null ;
         }
         if(k==0 || k ==1){
              
             return  head ;
         }
       int temp = k ;
         LinkedListNode<Integer> start = head;
          
          LinkedListNode<Integer> prestart = null;
          //  System.out.println(k+"&&&&") ;
       //   int i = 3 ;
          while(k-->0 && start != null){
              //System.out.println("*45") ;
            //  i-- ;
              prestart = start ;
            start = start.next ; 
         
         } 
         prestart.next = null ;
       //  System.out.println("*1") ;
         pair obj = new pair() ;
         obj = rev(head) ;
         obj.end.next = null ;
       //  System.out.println("*2") ;
          obj.end.next = kReverse(start , temp) ; 
         return obj.start ;
         }
 
     
      }