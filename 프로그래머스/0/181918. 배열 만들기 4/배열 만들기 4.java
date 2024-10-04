import java.util.Stack; 

class Solution {
    public int[] solution(int[] arr) {
        int[] stk = {};
        int i = 0;
        Stack<Integer> stack = new Stack<>();
        
        while(i < arr.length){
            if(stack.size() == 0){
                stack.push(arr[i]);
                i++;
            }
            else{
                if(stack.peek() < arr[i]){
                    stack.push(arr[i]);
                    i++;
                }
                else{
                    stack.pop();
                }
            }
        }
        stk = new int[stack.size()];
        for(int j=0;j<stack.size();j++){
            stk[j] = stack.get(j);
        }
        return stk;
    }
}