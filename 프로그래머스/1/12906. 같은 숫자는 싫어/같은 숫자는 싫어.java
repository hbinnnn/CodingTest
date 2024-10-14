import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        int[] answer = {};
        
        Stack<Integer> stack = new Stack<>();
        
        for(int n : arr){
            if(stack.isEmpty() || stack.peek() != n){
                stack.push(n);
            }
        }
        answer = new int[stack.size()];
        for(int i=0;i<stack.size();i++){
            answer[i] = stack.get(i);
        }
        return answer;
    }
}