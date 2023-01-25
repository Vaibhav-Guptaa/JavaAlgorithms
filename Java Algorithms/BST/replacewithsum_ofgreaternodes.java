public class Solution {

	/*
	 * Binary Tree Node class
	 * 
	 * class BinaryTreeNode<T> { T data; BinaryTreeNode<T> left; BinaryTreeNode<T>
	 * right;
	 * 
	 * public BinaryTreeNode(T data) { this.data = data; } }
	 */

   
	public static void replaceWithLargerNodesSum(BinaryTreeNode<Integer> root) {
        
     replaceWithLargerNodesSumbetter(root, 0) ;
        return;
    }
    
	public static int replaceWithLargerNodesSumbetter(BinaryTreeNode<Integer> root , int sum) {
	   if(root == null){
           return sum ;
       }
     else{
        		sum =   replaceWithLargerNodesSumbetter(root.right , sum) ;
         sum += root.data ;
         	    root.data = sum ;					
               sum = replaceWithLargerNodesSumbetter(root.left ,sum ) ;
                 return sum ;
     }
     
     }
}