public class solution {
	public static String[] getalpha(int n){
        if(n==2){
           String arr[] = {"a","b","c"} ;
            return arr ;
        }
        else if(n==7){
            String arr[] = {"p", "q", "r", "s"} ;
                return arr ;
        }
           else if(n==9){
            String arr[] = {"w", "x", "y", "z"} ;
                   return arr ;
        }
        else if(n==3){
           String arr[] = {"d","e","f"} ;
                return arr ;
        }
        else if(n==4){
           String arr[] = {"g","h","i"} ;
                return arr ;
        }
        else if(n==5){
           String arr[] = {"j","k","l"} ;
                return arr ;
        }else if(n==6){
           String arr[] = {"m","n","o"} ;
                return arr ;
        }
        else if(n==8){
           String arr[] = {"t","u","v"} ;
                return arr ;
        }
        return null ;
    }
	
	public static String[] keypad(int n){
  		int y = n ;
        if(n/10 ==0){
       return getalpha(n) ;}
         n = n%10 ;
        y =y/10 ;
        String [] er = keypad(y) ;
        	if(n == 7 || n==9){
            String[] out = new String[er.length*4] ;
                String[] alpha = getalpha(n) ;
        	for(int i = 0 ; i< er.length ; i++ ){
                out[i] = er[i]+ alpha[0] ;
            }
                for(int i = er.length ; i< 2*er.length ; i++ ){
                out[i] = er[i- er.length]+ alpha[1] ;
            }
                for(int i = 2*er.length ; i< 3*er.length ; i++ ){
                out[i] = er[i- 2*er.length]+ alpha[2] ;
            }
                for(int i = 3*er.length ; i< 4*er.length ; i++ ){
                out[i] = er[i- 3*er.length]+ alpha[3] ;
            }
                return out;
        }
    else{
        String [] out = new String[er.length*3] ;
         String[] alpha = getalpha(n) ;

        	for(int i = 0 ; i< er.length ; i++ ){
                out[i] =er[i]+ alpha[0] ;
            }
                for(int i = er.length ; i< 2*er.length ; i++ ){
                out[i] =er[i- er.length]+ alpha[1] ;
            }
                for(int i = 2*er.length ; i< 3*er.length ; i++ ){
                out[i] = er[i- 2*er.length]+ alpha[2] ;
            }
        return out ;
    }
        
    }
        
	}

