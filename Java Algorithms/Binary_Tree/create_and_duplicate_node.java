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

	public static void insertDuplicateNode(BinaryTreeNode<Integer> root) {
		if(root == null){
            return  ;
        }
        else{
            insertDuplicateNode( root.left ) ;
            insertDuplicateNode( root.right ) ;
            BinaryTreeNode<Integer> temp = root.left ;
             root.left = new BinaryTreeNode<>(root.data) ;  
             root.left.left = temp ;
            
        }
	}
	
}