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
	
     public static void rtl(BinaryTreeNode<Integer> root, int k, String str) {
         if(root == null){
             return ;
         }
         if(root.data == k && root.left == null && root.right == null){
            System.out.println(str+ root.data) ;
         }
         
         str = str + root.data+ " " ;
       
         rtl(root.left, k-root.data , str) ;
       
         rtl(root.right , k- root.data, str) ;
         
         return ;
         
     }
      public static void rootToLeafPathsSumToK(BinaryTreeNode<Integer> root, int k) {
            rtl(root, k, "") ;
     
                 
      }
 
 }