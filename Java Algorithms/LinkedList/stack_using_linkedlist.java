public class Stack {
	private Node head;
	private int size;
    
	public Stack() {
		head=null;
		size=0;
	}
	
	public int getSize() {
		return size;
	}
    
	public boolean isEmpty() {
        return size==0;
	}
    
	public void push(int elem) {
		Node newNode = new Node(elem);
        if(head==null){
            head=newNode;
        }
        else{
            newNode.next=head;
            head=newNode;
        }
        size++;
	}
    
	public int pop(){    
        if(head==null){
            return -1;
            // throw new StackEmptyException();
        }
        int data=this.head.data;
        head=this.head.next;
        size--;
        return data;
	}
	
	public int top() {
        if(head==null){
            return -1;
            // throw new StackEmptyException();
        }
        return head.data;
	}
    
}
// /*
//     Following is the structure of the node class for a Singly Linked List

//     class Node {
//         int data;
//         Node next;

//         public Node(int data) {
//             this.data = data;
//             this.next = null;
//         }

//     }

// */

// public class Stack {

//     private Node head ;
    
//     Node temp  = head ;

//     private int size ;
    

//     public Stack() {
//        head = null ;
//        size = 0 ;
    
//     }


//     public int getSize() { 
//         return size ;
//     }

//     public boolean isEmpty() {
//         if (temp ==null) {
//             return true ;
//         }
//         else{
//             return false ;
//         }
//     }

//     public void push(int element) {
//         size++ ;
//         Node attach = new Node(element) ;
//         attach.data = element ;
//         attach.next = head ;
//         head = attach ;
        
//         //Implement the push(element) function
//     }

//     public int pop() {
//         size-- ;
//         System.out.println(attach.data) ;
//         head  = attach.next ;
//         attach.next = null ;
//         //Implement the pop() function
//     }

//     public int top() {
//         System.out.print(head.data) ;
//         //Implement the top() function
//     }
// }