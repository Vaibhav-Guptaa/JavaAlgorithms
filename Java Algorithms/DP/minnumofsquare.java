public class Solution {

	public static int minCount(int n,  int dp [] ) {
	
        if(n ==0){
            return 0 ;
        }
        int min = Integer.MAX_VALUE ;
        for(int i = 1 ; i*i <= n ; i++){
            
            int cur ;
            if(dp[n - i*i] == -1){
               cur = minCount(n-i*i) ;
                   dp[n - i*i] = cur ; 
           		 }
            else{
                cur = dp[n - i*i] ;
            }
            if(min > cur ){
                min = cur ;
             
            }
            }
        return 1+min ;
           
        }
    public static int minCount(int n ) {
	
     int dp[] = new int [n+1] ;
        for(int i = 0 ; i <= n ; i++){
        dp[i] = -1 ;
        }
        return minCount(n , dp) ;
        
	}}

