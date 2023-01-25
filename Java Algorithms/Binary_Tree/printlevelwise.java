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
import java.util.Scanner ;
import java.util.* ;
public class Solution {

	public static void printLevelWise(BinaryTreeNode<Integer> root) {
        
      
		 Queue<BinaryTreeNode<Integer>> ty = new LinkedList<>();
         
         ty.add(root) ;
        
         while(!ty.isEmpty())
         {
             
             BinaryTreeNode<Integer> front = ty.poll();
             
             System.out.print(front.data + ":");
             
             if(front.left != null){
                 ty.add(front.left) ;
                 System.out.print("L:"+front.left.data+",");                 
             }else{
                 System.out.print("L:-1,") ;
                 
             }
             if(front.right != null){
                 ty.add(front.right);
                 System.out.print("R:"+front.right.data) ;                 
             }else{
                 System.out.print("R:-1") ;
                 
             }
             System.out.println() ;
         }
	}
	
}