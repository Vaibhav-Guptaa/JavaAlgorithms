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

import java.util.ArrayList; 

public class Solution {

	public static LinkedListNode<Integer> evenAfterOdd(LinkedListNode<Integer> head) {
		
LinkedListNode gull = new LinkedListNode(-1) ;
     LinkedListNode gulhead = gull ;   
ArrayList<Integer> c1 = new ArrayList<Integer>();
  ArrayList<Integer> c2 = new ArrayList<Integer>();      
        while(head!= null){
            if(head.data%2!=0){
                c1.add(head.data) ;
            }
            else{
                c2.add(head.data) ;
            }
            head = head.next ;
        }
        int yt = 0 ;
        int yt1 = 0 ;
        if(c1.size()>0 ){
         gull.data = c1.get(0) ;
        yt= 1 ;}
        else if(c2.size()>0 )
        {    yt1 =1 ;
                gull.data = c2.get(0) ; 
            
        }
        else{
            return null ;
        }
        
        for(int i = yt ; i<c1.size() ; i++){
            
           LinkedListNode gul1 = new LinkedListNode(c1.get(i)) ;
            
        gull.next = gul1 ;
            gull = gull.next ;
	}
        for(int i = yt1 ; i<c2.size() ; i++){
            
           LinkedListNode gul1 = new LinkedListNode(c2.get(i)) ;
            
        gull.next = gul1 ;
            gull = gull.next ;
            
	}
return gulhead ;
    }}