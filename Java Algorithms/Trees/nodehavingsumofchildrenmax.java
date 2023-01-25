class maxterm {
     int max ;
     TreeNode<Integer> maxSumNode ;
 }
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

  public static TreeNode<Integer> maxSumNode(TreeNode<Integer> root){
     return maxSumNode1(root).maxSumNode ;
 }
  
  public static maxterm maxSumNode1(TreeNode<Integer> root){
        maxterm ans = new maxterm()  ;
     if(root == null ){
         ans.max = Integer.MIN_VALUE ;
         ans.maxSumNode = null ;
     
         return ans ;
     }
     int sum = root.data ;
     for(int i = 0 ; i < root.children.size() ; i++ ){
         sum += root.children.get(i).data ;
     }
          ans.max  = sum ;
     ans.maxSumNode= root ;
     
      for(int i = 0 ; i < root.children.size() ; i++ ){
          if(maxSumNode1(root.children.get(i)).max > ans.max) {
              ans = maxSumNode1(root.children.get(i)) ;
             
          } 
     }
         return ans ;
     }
     
 }

