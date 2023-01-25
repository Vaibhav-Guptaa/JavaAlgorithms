
public class Solution {
	public static boolean checkMaxHeap(int arr[]) {
       return checkMaxHeap(arr, 0) ;
    }
    
	public static boolean checkMaxHeap(int arr[], int i) {
       
        if(i>=arr.length){
            return true ;
        }
	int	pi = i ;
        int li = 2*pi+1 ;
        int ri = 2*pi+2 ;
   if(ri>= arr.length){
       if(li>= arr.length){
           return true ;}
       else{
           return arr[li]<=arr[pi] ;
           }
       }
    
            if( arr[pi] >= arr[li] && arr[pi] >= arr[ri]){
               return (checkMaxHeap(arr,li))&(checkMaxHeap(arr, ri)) ;
            }else{
                return false ;
            }
        
    
    }
}