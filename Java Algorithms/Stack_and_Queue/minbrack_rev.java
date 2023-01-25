package Stack_and_Queue;
import java.util.* ;
public class minbrack_rev {
     
          public static int countBracketReversals(String input) {
               //Your code goes here
             Stack<Character> s = new Stack<>();
             if(input.length()%2!=0){
                 return  -1 ;
             }
             for(int i = 0 ;i< input.length()  ; i++){
                
                 if(input.charAt(i)=='{'){
                     s.push(input.charAt(i)) ;
                 }
                 else{
                     if(s.isEmpty()==true){
                          s.push(input.charAt(i)) ;
                     }
                     
                   else if(s.peek()=='{'){
                        s.pop() ;
                    } 
                     
                     else{
                         s.push(input.charAt(i)) ;
                     }
                 }
                 
             }
             int count= 0 ;
             while(s.isEmpty()==false){
                 char c1 = s.peek() ;
                 s.pop() ;
                 char c2 = s.peek();
                 s.pop() ;
                 if(c1==c2){
                     count++ ;
                 }else{
                     count+=2 ;
                 }
             }
          return count ;   
          }
     
     }