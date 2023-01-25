import java.util.* ;

public class Solution {

	public static ArrayList<Integer> kLargest(int input[], int k) {
	PriorityQueue<Integer> pq = new PriorityQueue<>(k) ;
        ArrayList<Integer> arr= new ArrayList<>() ;
        for(int i = 0 ; i < k ; i++){
            pq.add(input[i]) ;
        }
        for(int i = k ; i < input.length ; i++){
            if(input[i] > pq.peek()){
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