import java.util.ArrayList ;

public class PQ {
	ArrayList<Integer> arr ;
    public PQ(){
        arr= new ArrayList<>() ;
    }
	boolean isEmpty() {
		return arr.size()==0 ;
	}

	int getSize() {
		return arr.size(); 
	}

	int getMax(){
        if(arr.isEmpty()){
           return Integer.MIN_VALUE ;
        }
		return arr.get(0) ;
	}


	void insert(int elem) {
		arr.add(elem) ;
        int ci = arr.size() -1 ;
        int pi = (ci-1)/2 ;
        while(ci>0){
            if(arr.get(ci)> arr.get(pi)){
            int temp = arr.get(ci) ;
            arr.set(ci,arr.get(pi)) ;
            arr.set(pi,temp) ;
            }else{
                break ;
            }
            
            ci = pi ;
            pi = (ci-1)/2 ;
        }
        
	}
	int removeMax(){
        ArrayList<Integer> heap = arr ;
		
		if (arr.isEmpty()) {
			// Throw an exception
			  return Integer.MIN_VALUE ;
		}
        
        int minEle=getMax();
        
        heap.set(0,heap.get(heap.size()-1));
        
        heap.remove(heap.size()-1);
        
        int parentIndex=0;
        int leftChildIndex=2*parentIndex+1,rightChildIndex=2*parentIndex+2;
        while(leftChildIndex < heap.size())
        {
            int minIndex=parentIndex;
            
            if(heap.get(minIndex) < heap.get(leftChildIndex))
            {
                minIndex=leftChildIndex;
            }
            
            if(rightChildIndex < heap.size())
            {
                if(heap.get(minIndex) < heap.get(rightChildIndex))
            	{
                	minIndex=rightChildIndex;
            	}
            }
            
            if(minIndex == parentIndex)
            {
                return minEle;
            }
            
            int temp=heap.get(parentIndex);
            heap.set(parentIndex,heap.get(minIndex));
            heap.set(minIndex,temp);
            
            parentIndex=minIndex;
            leftChildIndex=2*parentIndex+1;
            rightChildIndex=2*parentIndex+2;
        }
        return minEle;
    }
}

class PriorityQueueException extends Exception {

}