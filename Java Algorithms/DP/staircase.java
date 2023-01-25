public class Solution {

	public static long staircase(int n) {
       
		long dp[] = new long [n] ;
        for(int i = 0 ; i< n; i++){
            dp[i] = -1; 
        }
        return stairhelp(n, dp) ;
       
}
public static long stairhelp(int n , long dp[] ){
    
     if(n ==1 || n==0){
            return 1 ;
        }
        if(n ==2){
            return 2 ;
        }
    
     if(dp[n-1] == -1){
            dp[n-1] = stairhelp(n-1, dp) ;
        }
           if(dp[n-2] == -1){
            dp[n-2] = stairhelp(n-2, dp) ;
        }
           if(dp[n-3] == -1){
            dp[n-3] = stairhelp(n-3, dp) ;
        }
        
        return dp[ n-1] + dp[n-2]+ dp[n-3] ;
}

}