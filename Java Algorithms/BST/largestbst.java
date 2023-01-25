class Pair{
   
     int min ; 
     int max  ;
     int height ;
     boolean isbst ;
 }
 public class Solution {
     
      /*
       * BinaryTreeNode class
       * 
       * class BinaryTreeNode<T> 
       * { 
       * 		T data; 
       * 		BinaryTreeNode<T> left; 
       * 		BinaryTreeNode<T> right;
       *		public BinaryTreeNode(T data) 
       *		{
       *  		this.data = data; 
       *  	} 
       *  }
       */
      public static int largestBSTSubtree(BinaryTreeNode<Integer> root) {
                 return larbst(root).height ;
     }
    
      public static Pair larbst(BinaryTreeNode<Integer> root) {
         if(root == null){
             Pair objj = new Pair() ;
             objj.min = Integer.MAX_VALUE ;
             objj.max = Integer.MIN_VALUE ;
             objj.isbst = true ;
             objj.height = 0 ;
             return objj ;
         }
        
              Pair lt = larbst(root.left) ;
         Pair rt = larbst(root.right) ;
        
       int min    = Math.min(root.data ,Math.min(lt.min, rt.min)) ;
                            
        int max  =  Math.max(root.data ,Math.max(lt.max,rt.max)) ;
          boolean isb = lt.isbst && rt.isbst && lt.max < root.data && rt.min > root.data ;
            // Write your code here
          Pair obj  = new Pair() ;
         obj.min = min ;
         obj.max = max ;
         obj.isbst = isb ;   
          if(isb){
             obj.height =  1+ Math.max(rt.height , lt.height) ;
         }
         else{
             obj.height = Math.max(rt.height , lt.height) ; 
         }
                             return obj ;
     }
      }