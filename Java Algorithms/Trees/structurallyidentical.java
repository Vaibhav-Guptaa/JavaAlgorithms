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
          
          public static boolean checkIdentical(TreeNode<Integer> root1, TreeNode<Integer> root2){
     
               if(root1 == null && root2 == null)
             {
                 return false ;
             }
             if(root1.children.size() == root2.children.size()){
             for(int i = 0 ; i< root1.children.size() ;i++){
                 if(root1.children.get(i).data != root2.children.get(i).data){
                     return false ;
                 }
             
             }boolean tryy = true ;
                  for(int i = 0 ; i< root1.children.size() ;i++){
                    tryy &= checkIdentical(root1.children.get(i) ,root2.children.get(i)) ;
             
             }
                 return tryy ;
          }else{
             return false ;
             }
             
             }
          
     }
     