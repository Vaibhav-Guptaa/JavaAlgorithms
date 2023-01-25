
public class Solution {
	
    
     static void printSolution(int board[][])  {  
    
     for (int i = 0; i < N; i++) {  
         for (int j = 0; j < N; j++){
             System.out.print(board[i][j]+" ");  
               }   
      }
      System.out.println(); 
 }
  
     static int N ;
 static boolean isSafe(int board[][], int row, int col)  
 {  
     int i, j;  
   
     /* Check this row on left side */
     for (i = 0; i < col; i++)  
         if (board[row][i] == 1)  
             return false;  
   
     /* Check upper diagonal on left side */
     for (i = row, j = col; i >= 0 && j >= 0; i--, j--)  
         if (board[i][j] == 1)  
             return false;  
   
     /* Check lower diagonal on left side */
     for (i = row, j = col; j >= 0 && i < N; i++, j--)  
         if (board[i][j] == 1)  
             return false;  
   
     return true;  
 }  
 static boolean solveNQUtil(int board[][], int col)  
 {  
     /* base case: If all queens are placed  
     then return true */
     if (col == N)  
     {  
         printSolution(board);  
         return true;  
     }  
   
     /* Consider this column and try placing  
     this queen in all rows one by one */
     boolean res = false;  
     for (int i = 0; i <board.length ; i++)  
     {  
         /* Check if queen can be placed on  
         board[i][col] */
         if ( isSafe(board, i, col))  
         { 
             board[i][col] = 1;  
   
             res = solveNQUtil(board, col + 1) || res;  
   
             board[i][col] = 0; 
         }  
     }  
   
     return res;  
 } 
                       
     
 public static void placeNQueens(int n){
      N = n ;
     int board[][] = new int[n][n];  
   
     if (solveNQUtil(board, 0) == false)  
     {  
         System.out.println();  
         return ;  
     }  
   
     return ;
      }
      
 }
 