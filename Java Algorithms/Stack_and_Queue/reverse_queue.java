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

}