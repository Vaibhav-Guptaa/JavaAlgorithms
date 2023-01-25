
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
          
          public static TreeNode<Integer> findNextLargerNode(TreeNode<Integer> root, int n){
             TreeNode<Integer> ans = new TreeNode<>(Integer.MAX_VALUE) ;
               if(root.data > n){
                 ans = root ;
             }
              for(int i = 0 ; i < root.children.size() ; i++)
             { 		 TreeNode<Integer> temp = findNextLargerNode(root.children.get(i) , n) ;
                  if(temp != null && ans.data > temp.data ){
                     ans = temp ;
                 }
             }
             return ans ;
         }
     }
     