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

/*public class Solution {

	public static boolean isPalindrome(LinkedListNode<Integer> head) {
        
         LinkedListNode<Integer> current = head;
     LinkedListNode<Integer> orig = head;
         //new LinkedListNode<>(head.data);
       
        LinkedListNode<Integer> tempp = orig ;
        while(head != null){
            orig.data = head.data ;
            head = head.next ;
            orig = orig.next ;
            
        }
		 LinkedListNode<Integer> prev = null;
    
     LinkedListNode<Integer> aft = null;
        
        while(current != null){
            aft = current.next ;
            current.next = prev ;
             prev = current ;
            current = aft ;
        }
      
        //boolean isbool= false ;
        int i =0 ;
        while(prev != null && tempp != null){
            
             if(tempp.data != prev.data){
                 return false ;
             }
            prev= prev.next ;
        tempp = tempp.next ;
        }
        
    //System.out.println(i) ;
        return true;
    
         
    
    
    }

} */
public class Solution {

	public static boolean isPalindrome(LinkedListNode<Integer> head) {
		
        if(head==null){
            return true;
        }
        else{
        LinkedListNode<Integer> mid=middle(head);
        LinkedListNode<Integer> last=reverse(mid);
        LinkedListNode<Integer> curr=head;
        while(last!=null){
            if(curr.data!=last.data) return false;
            
            last=last.next;
            curr=curr.next;
        }
       return true; 
            
	}
    }
    static LinkedListNode<Integer> middle(LinkedListNode<Integer> head){
    LinkedListNode<Integer> slow=head;
        LinkedListNode<Integer> fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
        }
    static LinkedListNode<Integer> reverse(LinkedListNode<Integer> head){
        LinkedListNode<Integer> temp=null;
        LinkedListNode<Integer> next=head;
      //  LinkedListNode<Integer> t=head;
        while(head!=null){
          next=head.next;
            head.next=temp;
            temp=head;
            head=next;
        }
        return temp;
    }
    
}