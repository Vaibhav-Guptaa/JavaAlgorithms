import java.util.* ;
public class Solution {
	
	static void heapify(int []arr , int n ,  int pi){
        int left = pi*2+1 ;
        int right = pi*2+2 ;
        int largest = pi ;
        if(left< n && arr[left] > arr[pi]){
			largest = left ;
        }
         if(right< n && arr[right] > arr[largest]){
			largest = right ;
        }
        if(largest != pi){
        int temp = arr[largest] ;
            arr[largest] = arr[pi] ;
            arr[pi] = temp ;
            heapify(arr , n,largest) ;
        }
    }
	public static void inplaceHeapSort(int arr[]) {
        int n = arr.length ;
        for(int i = (n-2)/2 ; i>=0 ; i--){
            heapify(arr, n,  i) ;
        }
        for(int i = n-1 ; i > 0 ; i--){
            int temp= arr[0] ;
        	arr[0] = arr[i] ;
            arr[i] = temp ;
            heapify(arr,i , 0) ;
        }
      for(int i = 0 ; i< n/2 ; i++){
          int temp = arr[i] ;
          arr[i] = arr[n-i-1] ;
          arr[n-i-1] = temp ;
      }
	
    }}
