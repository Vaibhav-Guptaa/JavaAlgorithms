package Stack_and_Queue;
import java.util.* ;
public class Solution {

	public static void reverseStack(Stack<Integer> input, Stack<Integer> extra) {
        if(input.isEmpty()){
            return ;
        }
		 int temp = input.pop() ;
       	
        
        reverseStack(input , extra) ;
         while(input.size() != 0){
            extra.push(input.pop()) ;
        }
        input.push(temp) ;
        while(extra.size() != 0){
            input.push(extra.pop()) ;
        }
        
	}
}