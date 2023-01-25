import java.util.HashMap;

public class Solution {

	public static String uniqueChar(String str){
		HashMap<Character, Integer> ha = new HashMap<>() ;
         String strr = "" ;
        
        for(int i = 0 ; i< str.length() ; i++) {
            if(!ha.containsKey(str.charAt(i))){
            ha.put(str.charAt(i),1) ;
                strr +=str.charAt(i) ;
            }
        }
       
      
      return strr ;
}
}