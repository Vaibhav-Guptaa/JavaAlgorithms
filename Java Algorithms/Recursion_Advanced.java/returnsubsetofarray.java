public class solution {

	// Return a 2D array that contains all the subsets
	public static int[][] subsets(int input[]) {
		return helper(input, 0);
	}
    public static int [][] helper(int input[], int si){
        if(si == input.length){
            return new int[1][0] ;
        }
        int [][] small1 = helper(input, si+1) ;
        int [][] small2 = new int [small1.length*2][] ;
        int index = 0 ;
        for(int i = 0 ; i< small1.length;i++){
      
               small2[index] = small1[i] ;
           
            index++ ;
        }
        
         for(int i = 0 ; i< small1.length;i++){
                small2[index] = new int[small1[i].length+1] ;
             
              for(int j = 0 ; j<= small1[i].length ; j++){
                  if(j ==0){
                 small2[index][j] = input[si];}
            
                  
        else{
                  small2[index][j] = small1[i][j-1] ;
                  
              }
         
              }
            index++ ;
        }
        return small2 ;
    }
}





