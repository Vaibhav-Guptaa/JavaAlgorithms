public class Solution {

	/*	Binary Tree Node class 
	 * 
	 * 	class BinaryTreeNode<T> {
			T data;
			BinaryTreeNode<T> left;
			BinaryTreeNode<T> right;
			
			public BinaryTreeNode(T data) {
				this.data = data;
			}
		}
		*/
		public static BinaryTreeNode<Integer> SortedArrayToBSTbetter(int[] arr,int l , int r , int n){
            if(l>r){
                return null ;
            }
            
            BinaryTreeNode<Integer> root = new BinaryTreeNode<>(arr[(r+l)/2]) ;
            root.left = SortedArrayToBSTbetter(arr, l , (r+l)/2-1, n) ;
            root.right = SortedArrayToBSTbetter(arr, (r+l)/2 +1, r , n) ;
            return root ;
        }
    
		public static BinaryTreeNode<Integer> SortedArrayToBST(int[] arr, int n){
			return  SortedArrayToBSTbetter(arr, 0 , arr.length -1 ,  n) ;
		}
	}