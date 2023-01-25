package Binary_Tree;
/*
	
	Following the structure used for Binary Tree
	
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

	public static void preOrder(BinaryTreeNode<Integer> root) {
        if(root==null){
            return ;
        }
		System.out.print(root.data+" ") ;
        if(root.left!= null){
            preOrder( root.left) ;
        }
        if(root.!= null) ;
         preOrder( root.right) ;
	}
    

}