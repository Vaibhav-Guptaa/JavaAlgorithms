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
	static int heig(BinaryTreeNode<Integer> root){
        if(root==null){
            return 0 ;
        }
        return 1  + Math.max(heig(root.left), heig(root.right));
    }
	public static int diameterOfBinaryTree(BinaryTreeNode<Integer> root){
        if(root==null){return 0 ;}
        
		int lr = 1+ heig(root.left) + heig(root.right) ;
        int ll = diameterOfBinaryTree( root.left) ;
    	int rr = diameterOfBinaryTree(root.right) ;
        return Math.max(lr, Math.max(ll,rr)) ;
	}
	
}