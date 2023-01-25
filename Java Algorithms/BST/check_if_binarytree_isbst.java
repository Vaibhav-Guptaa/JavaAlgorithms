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

 public class Solution {

    
     public static boolean isBST(BinaryTreeNode<Integer> root) {
         
         return isBST( root, Integer.MIN_VALUE , Integer.MAX_VALUE) ;
     }
      public static boolean isBST(BinaryTreeNode<Integer> root, int min , int max) {
           if(root == null){return true ;}
         
         else{
             return root.data>min && root.data < max && isBST(root.left , min, root.data) && isBST(root.right , root.data , max) ;
         }
           
     }
 }