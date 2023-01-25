import java.util.ArrayList;

public class Solution {

	/*
	 * Binary Tree Node class
	 * 
	 * class BinaryTreeNode<T> { 
	 * 		T data; 
	 * 		BinaryTreeNode<T> left; 
	 * 		BinaryTreeNode<T> right;
	 * 		public BinaryTreeNode(T data) 
	 * 		{ 
	 * 			this.data = data; 
	 * 		}
	 * }
	 */

	public static ArrayList<Integer> getPath(BinaryTreeNode<Integer> root, int data){
		
        if(root == null){
            return null ;
        }
    	ArrayList<Integer> output = new ArrayList<>() ;
        if(root.data == data){
        	output.add(root.data) ;
            return output ;
        }
        else{
        
            if(getPath(root.left, data)!= null){
                	ArrayList<Integer> leftout = getPath(root.left , data) ;
                leftout.add(root.data) ;
                return leftout ;
            }else{
                if(getPath(root.right, data)!= null){
                    	ArrayList<Integer> rightout = getPath(root.right , data) ;
                rightout.add(root.data) ;
                return rightout ;
                }
                else{
                    return null ;
                }
            }
        
    }}}