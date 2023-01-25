import java.util.*;

public class Solution {
	/*
	 * BinaryTreeNode class
	 * 
	 * class BinaryTreeNode<T> 
	 * { 
	 * 		T data; 
	 * 		BinaryTreeNode<T> left; 
	 * 		BinaryTreeNode<T> right;
	 *		public BinaryTreeNode(T data) 
	 *		{
	 *  		this.data = data; 
	 *  	} 
	 *  }
	 */
	/*
	 * LinkedListNode Class
	 * class LinkedListNode<T> 
	 * { 
	 * 		T data; 
	 * 		LinkedListNode<T> next;
	 * 		public LinkedListNode(T data) 	
	 * 		{
	 *  		this.data = data; 
	 *  	} 
	 *  }
	 */
	public static ArrayList<LinkedListNode<Integer>> constructLinkedListForEachLevel(BinaryTreeNode<Integer> root){
        if(root == null){
            return null ;
        }
        Queue <BinaryTreeNode<Integer>>  qu  =new LinkedList<>() ;
		qu.add(root) ;
        qu.add(null) ;
      	ArrayList<LinkedListNode<Integer>> arr  = new ArrayList<>() ;
        LinkedListNode<Integer> head = null ;
        LinkedListNode<Integer> tail = null ;
    	while(!qu.isEmpty()){ 
            BinaryTreeNode<Integer> bin = qu.poll() ;
         
            if(bin != null && bin.left != null){
                
             qu.add(bin.left) ;
            }
            
            if(bin!= null && bin.right != null){
                qu.add(bin.right) ;
                }
            if(head == null){
                
                head = new LinkedListNode<Integer>(bin.data) ;
                tail = head ;
                
            
            }
            else{
                if(bin== null){
                    arr.add(head) ;
                    head = null ;
                    tail = null ;
                       if(qu.isEmpty()){
                break ;
            }else{
                    qu.add(null) ;}
                }else{
                    
                    tail.next = new LinkedListNode<Integer>(bin.data) ;
                    tail = tail.next ;
                }
            }
              
        }
        
	return arr ;}

}