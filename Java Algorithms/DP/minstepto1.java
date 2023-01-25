public class Solution {

	public static int countMinStepsToOne(int n) {
		if(n ==1){
            return 0 ;
        }
       int ans1 = Integer.MAX_VALUE ;
       int    ans2 = Integer.MAX_VALUE ;
       int   ans3 = Integer.MAX_VALUE ;
   		 ans1 =1+ countMinStepsToOne(n-1) ;
        if(n%2 ==0)
       ans2 = 1+countMinStepsToOne(n/2) ;
        if(n%3 ==0)
      ans3 =1+ countMinStepsToOne(n/3) ;
        
        return Math.min(ans1, Math.min(ans2, ans3)) ; 
        
      /* DP SOLUTION
       public class Solution {

	public static int countMinStepsToOne(int n) {
		if(n ==1){
            return 0 ;
        }
       int ans1 = Integer.MAX_VALUE ;
       int    ans2 = Integer.MAX_VALUE ;
       int   ans3 = Integer.MAX_VALUE ;
   		 ans1 =1+ countMinStepsToOne(n-1) ;
        if(n%2 ==0)
       ans2 = 1+countMinStepsToOne(n/2) ;
        if(n%3 ==0)
      ans3 =1+ countMinStepsToOne(n/3) ;
        
        return Math.min(ans1, Math.min(ans2, ans3)) ; 
        
      
	}

}
       */
	}

}