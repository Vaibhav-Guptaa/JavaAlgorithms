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

 /* 
 * Main Method being used internally
 *	public static void main(String[] args) throws IOException {
 *		BinarySearchTree bst = new BinarySearchTree();
 *		int choice, input;
 *		int q = Integer.parseInt(br.readLine());
 *		while (q-- > 0) {
 *			st = new StringTokenizer(br.readLine());
 *			choice = Integer.parseInt(st.nextToken());
 *			switch (choice) {
 *			case 1:
 *				input = Integer.parseInt(st.nextToken());
 *				bst.insert(input);
 *				break;
 *				case 2:
 *				input = Integer.parseInt(st.nextToken());
 *				bst.remove(input);
 *				break;
 *			case 3:
 *				input = Integer.parseInt(st.nextToken());
 *				System.out.println(bst.search(input));
 *				break;
 *			default:
 *				bst.printTree();
 *				break;
 *			}
 *		}
 *	}
 */

// public class BinarySearchTree {
//     private BinaryTreeNode<Integer> root ;
//     private int size; 
    
// 	public void insert(int data) {
// 	 insertb(root , data) ;
// 	}
// 	public static BinaryTreeNode<Integer> insertb(BinaryTreeNode<Integer> root , int data){
//         	if(root == null){
//                 BinaryTreeNode<Integer> newNode = new BinaryTreeNode<Integer>(data) ;
//                 return newNode; 
//             }
//          if(root.data > data){
//             return insertb(root.left , data) ;
//          }
//          else {
//             return insertb(root.right , data) ;
//          }
    
//     }
    
//     public BinaryTreeNode<Integer> removeb(BinaryTreeNode<Integer> root , int data) {
//         if(root == null){
//             return null ;
//         }
//         if(root.data > data){
//           BinaryTreeNode<Integer> leftside = removeb(root.left , data); 
//             root.left = leftside ;
//         }
//         else if(root.data < data){
//           BinaryTreeNode<Integer> rightside = removeb(root.right , data); 
//             root.right = rightside ;
//         }
//         else if(root.data == data){
//           if(root.left == null && root.right == null){
//               return null ;
//           }
//             else if(root.left == null){
//                 return root.right  ;
//             }
//             else if(root.right == null){
//                 return root.left ;
//             }
//             else{
//                 if(root.right.left ==null){
//                     root.data = root.right.data ;
                    
//                 }else{
//                 root.data = root.right.left.data ;
//                 }
//                 return root; 
//             }
//         }
//         return root  ;
//     }
// 	public void remove(int data) {
//         removeb(root , data) ;
// 	}
// 	public void printTree() {
//         ptb(root) ;
//     }
// 	public void ptb(BinaryTreeNode<Integer> root) {
//         if(root == null){
//             return ;
//         }
// 		System.out.print(root.data+":L:") ;
//         if(root.left !=null){

//             	System.out.print(root.left.data) ;
//         }
//         System.out.print(",R:") ;
//           if(root.right !=null){

//             	System.out.print(root.right.data) ;
//         }
            
//         ptb(root.left) ;
//         ptb(root.right) ;
// 	}
// 	public static boolean searchb(BinaryTreeNode<Integer> root, int data) {
//         if(root.data == data){
//             return true ;
//         }
//         else if(root.data > data){
//             return searchb(root.left , data) ;
//         }
//           else if(root.data < data){
//             return searchb(root.right , data) ;
//         }
//       return false ;
//     }
    
// 	public boolean search(int data) {
        
// 			return searchb(root , data) ;
// 	}
	

// }


public class BinarySearchTree {
     private static BinaryTreeNode<Integer> root;
     
      public static void insert(int data) {
           //Implement the insert() function
         root=insert(data,root);
      }
     
     public static BinaryTreeNode<Integer> insert(int data,BinaryTreeNode<Integer> root){
         if(root==null){
             BinaryTreeNode<Integer> node=new BinaryTreeNode<>(data);
             return node;
         }
         if(root.data<data){
             root.right =insert(data,root.right); 
         }else{
             root.left=insert(data,root.left);
         }
         return root;
     }
      
      public void remove(int data) {
           //Implement the remove() function
         root=remove(data,root);
      }
     
     public static BinaryTreeNode<Integer> remove(int data,BinaryTreeNode<Integer> root){
         if(root==null){
             return null;
         }
         if(root.data<data){
             
             root.right=remove(data,root.right);
             
         }else if(root.data>data){
             
             root.left=remove(data,root.left);
         }else{
             if(root.left==null){
                 return root.right;
             }
             if(root.right==null){
                 return root.left;
             }
             if(root.left==null && root.right==null){
                 return null;
             }
             if(root.left!=null && root.right!=null){
                 
                 root.data=minimum(root.right);
                // root.right=remove(root.data,root.right);
             }
         }
         return root;
     }
     
     public static int minimum(BinaryTreeNode<Integer> root){
         int minv=root.data;
         while(root.left!=null){
             minv =root.left.data;
             root=root.left;
         }
         return minv;
     }
      
     public static void printTree(){
         printHelper(root);
         return;
     }
     
     private static void printHelper(BinaryTreeNode<Integer> root)
     {
         if(root==null)
             return ;
         String s=root.data+":";
         //System.out.print(root.data+":");
         if(root.left!=null)
             s=s+"L:"+root.left.data+",";
             //System.out.print("L:"+root.left.data+",");
         if(root.right!=null){
             s=s+"R:"+root.right.data;
             //System.out.print("R:"+root.right.data);
         }
         System.out.println(s);
         //System.out.println();
         printHelper(root.left);
         printHelper(root.right);
         return;
     }
      
      public boolean search(int data) {
           //Implement the search() function
         return hasDatahelper(data,root);
      }
     
     public static boolean hasDatahelper(int data,BinaryTreeNode<Integer> root){
         if(root==null){
             return false;
         }
         if(root.data==data){
             return true;
         }else if(root.data<data){
             return hasDatahelper(data,root.right);
         }else{
             return hasDatahelper(data,root.left);
         }
     }
 }