public class solution {
	
	public static String[] permutationOfString(String input){
		// Write your code here
        if(input.length() == 0){
            String y[] = {""};
            return y;}
        
        String [] ans = permutationOfString(input.substring(1)); 
                    
            int index = 0 ;
           String finall[] = new String [input.length()*ans.length] ;

      for(int j =0  ; j< ans.length ;j++){
                    finall[index] = input.charAt(0)+ans[j] ;
                        index++ ;
                }
     
        for(int i = 1 ; i< input.length() ; i++){
     
                 String [] anss = permutationOfString(input.substring(0,i)+input.substring(i+1));
            	for(int j =0  ; j< anss.length ;j++){
                    finall[index] = input.charAt(i)+anss[j] ;
                        index++ ;
                }
        }
        return finall ;
}
}