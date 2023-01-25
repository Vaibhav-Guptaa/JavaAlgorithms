/*
	Following is the structure of the node class for a Singly Linked List

	class Node {
		int data;
		Node next;

		public Node(int data) {
			this.data = data;
			this.next = null;
		}

	}

*/

public class Queue {
	
	private Node  front;
    private Node  rear ;
    int size;//Define the data members


	public Queue() {
        front = null ;
        rear = null ;
		size =0 ;
	}
	

	public int getSize() { 
			return size ;
    }


    public boolean isEmpty() { 
    		return size==0 ;
    }


    public void enqueue(int data) {
        Node rty = new Node(data) ;
        size++ ;
    	if(front == null){
            front = rty ;
            rear = rty ;
        }
        else{
            rear.next = rty ;
            rear = rear.next ;
        }
    }


    public int dequeue() {
        
    	if(front == null){
            return -1;
        }
        size-- ;
        Node rty1  = front ;
        front = front.next ;
    return rty1.data ;}


    public int front() {
    	if(front == null){
            return -1 ;
        }
        return front.data ;
    }
}
