import java.util.* ;
public class Solution {

	public static int lengthOfLongestSubsetWithZeroSum(int arr[]) {
		HashMap<Integer, Integer> ha = new HashMap<>() ; 
        int sum = 0 ;
        int maxlen = Integer.MIN_VALUE ;
        for(int i = 0 ; i< arr.length ; i++){
            sum += arr[i] ;
            
            if(ha.containsKey(sum) || sum == 0){ 
                if(sum == 0){
                    if(i+1 > maxlen){
                        maxlen  = i+1 ;
                    }
                }
            	else if(i-ha.get(sum) > maxlen){
                    maxlen =i-ha.get(sum) ;
                }
            }
          
            else{
            ha.put(sum, i) ;
            }
        
        }
        return maxlen ;
    }
}