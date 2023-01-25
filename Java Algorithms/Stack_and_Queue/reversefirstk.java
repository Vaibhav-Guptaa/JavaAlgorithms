import java.util.LinkedList;
import java.util.Queue;

public class Solution {
	public static void reverseQueue(Queue<Integer> input) {
        if(input== null){
            return ;
        }
        if(input.size()==1){
            return ;
        }
		int tem = input.poll() ;
        reverseQueue(input) ;
        input.add(tem) ;
        return ;
	}

	public static Queue<Integer> reverseKElements(Queue<Integer> input, int k) {
		Queue<Integer> rty = new LinkedList<>() ;
        for(int i = 0 ;i<k;i++){
            rty.add(input.poll()) ;
        }
        reverseQueue(rty) ;
   		 while(!input.isEmpty()){
        		rty.add(input.poll()) ;
        }     
	
    return rty 
        ;}

}