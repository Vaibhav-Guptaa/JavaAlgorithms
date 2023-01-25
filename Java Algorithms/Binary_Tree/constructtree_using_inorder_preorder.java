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
    
     public static BinaryTreeNode<Integer> buildTree(int[] preOrder, int[] inOrder, int l1, int r1, int l2 , int r2 ){
     if(l1>r1){
             return null ;
         }
           BinaryTreeNode<Integer> root = new BinaryTreeNode<>(preOrder[l1]) ;
         int i = l2 ;
         while(inOrder[i]!=root.data){
             i++;
         }
         
         root.left =  buildTree(preOrder, inOrder, l1+1, l1+i-l2 ,l2, i-1 ) ;
         root.right = buildTree(preOrder, inOrder, l1+i-l2+1 , r1 ,i+1 ,r2) ;
         return root  ;
         
     }
 
      public static BinaryTreeNode<Integer> buildTree(int[] preOrder, int[] inOrder) {
         return buildTree( preOrder, inOrder, 0 ,preOrder.length-1, 0, preOrder.length-1) ;
      }
 
 }