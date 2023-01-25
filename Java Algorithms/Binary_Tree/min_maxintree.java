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



/*

	Representation of the Pair Class

	class Pair<T, U> {
		T minimum;
		U maximum;

		public Pair(T minimum, U maximum) {
			this.minimum = minimum;
			this.maximum = maximum;
		}

	}

*/

public class Solution {
	public static int getmin(BinaryTreeNode<Integer> root, int min ) {
        if(root == null){
            return min ;
        }
        if(root.data < min){
            min = root.data ;
        }
        int froml = getmin(root.left , min) ;
        int fromr = getmin(root.right ,min) ;
        return Math.min(froml , fromr) ;
    }
    public static int getmax(BinaryTreeNode<Integer> root ,int max) {
            if(root == null){
            return max ;
        }
        if(root.data > max){
            max = root.data ;
        }
        int froml = getmax(root.left , max) ;
        int fromr = getmax(root.right ,max) ;
        return Math.max(froml , fromr) ;
    }
    
	public static Pair<Integer, Integer> getMinAndMax(BinaryTreeNode<Integer> root) {
        Pair dd = new Pair(0 ,0) ;
		dd.minimum = getmin(root, Integer.MAX_VALUE) ;
        dd.maximum = getmax(root , Integer.MIN_VALUE) ;
        return dd ;
	}
	
}