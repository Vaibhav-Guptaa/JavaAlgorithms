import java.util.*;

public class Solution {

	public static ArrayList<Integer> kSmallest(int n, int[] input, int k) {
	
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> b - a) ;
        ArrayList<Integer> arr= new ArrayList<>() ;
        for(int i = 0 ; i < k ; i++){
            pq.add(input[i]) ;
        }
        for(int i = k ; i < n ; i++){
            if(input[i] < pq.peek()){
                pq.poll() ;
                pq.add(input[i]) ;
            }
            
        }
       while(!pq.isEmpty()){
            arr.add(pq.poll()) ;
        }
        return arr ;
        
	}
}