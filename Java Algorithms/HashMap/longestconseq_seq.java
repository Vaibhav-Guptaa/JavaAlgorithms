import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;

public class Solution {
	public static ArrayList<Integer> longestConsecutiveIncreasingSequence(int[] arr) {
	 	HashMap<Integer, Boolean> ha = new HashMap<>() ; 
        for(int i = 0 ; i< arr.length ; i++){
            ha.put(arr[i], true) ;
        }
        int maxcount = Integer.MIN_VALUE ;
        ArrayList<Integer> fina = new ArrayList<>() ;
        for(int i = 0 ; i< arr.length ; i++){
            if(ha.containsKey(arr[i]-1)){
                continue ;
            }
            else{
                int count = 1 ;
                ArrayList<Integer> ar = new ArrayList<>() ;
                ar.add(arr[i]) ;
             
                if(!ha.containsKey(arr[i]+1))
                {
                  continue ;  
                } 
                int k = arr[i]+1 ;
                while(ha.containsKey(k)){
                    count++; 
                    k++ ; 
                }
                ar.add(k-1) ;
                if(count > maxcount){
                    maxcount = count ;
                    fina = ar ;
                }
                
            }
        }
    return fina ;}
}