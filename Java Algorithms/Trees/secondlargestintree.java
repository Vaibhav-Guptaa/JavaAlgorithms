

public class Solution {

     /*	TreeNode structure 
      * 
      * class TreeNode<T> {
               T data;
               ArrayList<TreeNode<T>> children;
     
               TreeNode(T data){
                    this.data = data;
                    children = new ArrayList<TreeNode<T>>();
               }
          }*/
          
          public static TreeNode<Integer> largest;
         public static TreeNode<Integer> secondLargest;
       
         // Helper Function to find the second largest node of the n-ary tree
         public static void findSecondLargestHelper(TreeNode<Integer> root)
         {
            
             // Base Case
             if (root == null) {
                 return;
             }
              
             // Check if root's data is larger than current largest node's data
             if (root.data > largest.data) {
                 secondLargest = largest;
                 largest = root;
             } else if (root.data > secondLargest.data && root.data != largest.data)
                 secondLargest = root;
              
             // recursively find second largest in children
             for (TreeNode child: root.children)
                 findSecondLargestHelper(child);
         }
          
         // Function to find the second largest node of the n-ary tree
         public static TreeNode<Integer> findSecondLargest(TreeNode<Integer> root)
         {
            
             // Initialising the pointers to a node with value negative infinity
             largest = new TreeNode<>( Integer.MIN_VALUE);
             secondLargest = largest;
              
             findSecondLargestHelper(root);
             return secondLargest;
         }
     }