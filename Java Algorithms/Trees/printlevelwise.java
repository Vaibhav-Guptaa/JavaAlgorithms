import java.util.* ;
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

	
	
	public static void printLevelWise(TreeNode<Integer> root){
		Queue<TreeNode<Integer>> qu = new LinkedList<>() ;
        if(root == null){
            return ;
        }      
        qu.add(root) ;
        qu.add(null) ;
        while(!qu.isEmpty()) {
            
           if(qu.peek() == null){
               System.out.println() ;
               qu.poll() ;
               if(!qu.isEmpty()){
                 qu.add(null) ;
             
               }
               continue ;
           }
            for(int i = 0 ; i< qu.peek().children.size() ; i++){
                qu.add(qu.peek().children.get(i)) ;
            }
            
             
            System.out.print(qu.poll().data+" ") ;
            
        }
        }
}
