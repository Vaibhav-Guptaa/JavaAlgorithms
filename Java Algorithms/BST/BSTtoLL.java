

public class Solution {

	/*
	 * Binary Tree Node class
	 * 
	 * class BinaryTreeNode<T> { T data; BinaryTreeNode<T> left; BinaryTreeNode<T>
	 * right;
	 * 
	 * public BinaryTreeNode(T data) { this.data = data; } }
	 */

	/*
	 * LinkedList Node Class
	 *
	 * 
	 * class LinkedListNode<T> { T data; LinkedListNode<T> next;
	 * 
	 * public LinkedListNode(T data) { this.data = data; } }
	 */
    public static void marrofbst(BinaryTreeNode<Integer> root , LinkedListNode<Integer> a){
        if(root== null){
            return ;
        }
        else{
            marrofbst(root.left,a) ;
        LinkedListNode<Integer> lt = new LinkedListNode<>(root.data) ;
           while(a.next != null){
               a = a.next ;
           }
               
            a.next =lt ;
        
            marrofbst(root.right, a) ;
        }
        
    }

	public static LinkedListNode<Integer> constructLinkedList(BinaryTreeNode<Integer> root) {
        LinkedListNode<Integer> lt = new LinkedListNode<>(-2) ;
	     marrofbst(root , lt) ;
         return lt.next ;
        
	}
}