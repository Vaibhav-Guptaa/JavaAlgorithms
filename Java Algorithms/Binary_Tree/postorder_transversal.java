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

	public static void postOrder(BinaryTreeNode<Integer> root) {
		    if(root==null){
            return ;
        }
		
        if(root.left!= null){
            postOrder( root.left) ;
        }
        if(root.left!= null) ;
         postOrder( root.right) ;
		System.out.print(root.data+" ") ;
    }
}
