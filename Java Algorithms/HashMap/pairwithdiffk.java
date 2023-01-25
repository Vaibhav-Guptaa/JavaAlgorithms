import java.util.* ;
public class Solution {

	public static int getPairsWithDifferenceK(int arr[], int k) {
			HashMap<Integer, Integer> ha = new HashMap<>() ; 
        int count= 0  ;
           for(int i = 0 ; i< arr.length ; i++){
   
            if(!ha.containsKey(arr[i])){
            ha.put(arr[i],1) ;
            }
            else{
              int g = (ha.get(arr[i]))+1 ;
                ha.put(arr[i],g) ;
                }
        }
            
        if(k==0){
     for(int i = 0; i<arr.length; i++){
                  if(ha.containsKey(arr[i])){
               int nh = ha.get(arr[i]) ;
                if(nh>1){
                count += nh*(nh-1)/2;
                }
                ha.remove(arr[i]);
                  }
            }
            return count ;
        }else{
          
           for(int i = 0 ; i< arr.length ; i++){
   			if(ha.containsKey(arr[i])){
        
            if(ha.containsKey(arr[i]+k)){
             
                count += (ha.get(arr[i]+k))*(ha.get(arr[i])) ;
            }
                
            if(ha.containsKey(arr[i]-k)){
                count += (ha.get(arr[i]-k))*(ha.get(arr[i])) ;
            }
              ha.remove(arr[i]) ;
           } }
       return count ;  }
       
    }
}