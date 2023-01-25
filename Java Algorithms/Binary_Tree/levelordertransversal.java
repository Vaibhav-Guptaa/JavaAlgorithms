/*
	
	Following is the structure used to represent the Binary Tree Node

	class BinaryTreeNode<T> {
		T data;
		BinaryTreeNode<T> left;
		BinaryTreeNode<T> right;

		public BinaryTreeNode(T data) {
			this.data = data;
			this.left = null;
			this.right = null;
		}
	}

*/
import java.util.* ;
public class Solution {

	public static void printLevelWise(BinaryTreeNode<Integer> root) {
        if(root ==null){
            return ; 
        }
			Queue<BinaryTreeNode<Integer>> qu = new LinkedList<>() ;
        	qu.add(root) ;
        	qu.add(null) ;
         while(!qu.isEmpty()){
             if(qu.peek() != null){
                 if(qu.peek().left != null){
                 qu.add(qu.peek().left) ;}
                 if(qu.peek().right != null){
                 qu.add(qu.peek().right) ;}
            System.out.print(qu.poll().data +" ") ;
             }
             else{
                   System.out.println() ;
                 qu.poll() ;
                 if(!qu.isEmpty()){
                 qu.add(null) ;}
             }
        }
	}
	
}