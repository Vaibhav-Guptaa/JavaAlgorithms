package Stack_and_Queue;

import java.util.* ;
public class Stack {
 	
    	private Queue<Integer> q1 ;
    	private Queue <Integer> q2 ;
    	private int size  ;

    public Stack() {
        q1 = new LinkedList<>() ;
        q2 = new LinkedList<>() ;
        size = 0 ;
        
    }

    public int getSize() { 
        return size ;
    }

    public boolean isEmpty() {
        return size==0 ;
    }

    public void push(int element) {
        q1.add(element) ;
        size++ ;
    }

    public int pop() {
        if(size ==0){
            return -1 ;
        }
        
      	for(int i = 0 ;i< size-1; i++){
           
            q2.add(q1.poll()) ;
          
            
        }
        int yu =  q1.peek() ;
        q1.poll() ;
        for(int i = 0 ;i< size-1; i++){
           
            q1.add(q2.poll()) ;
          
            
        }
        size--;
        return yu ;
        
    }

    public int top() {
       if(size ==0){
            return -1 ;
        }
        
      	for(int i = 0 ;i< size-1; i++){
           
            q2.add(q1.poll()) ;
          
            
        }
        int yu =  q1.peek() ;
        q1.poll() ;
        for(int i = 0 ;i< size-1; i++){
           
            q1.add(q2.poll()) ;
          
            
        }
        q1.add(yu) ;
        return yu ;
        
      //  return q1.peek() ;
    }
}