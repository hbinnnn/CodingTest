import java.util.Stack;

class Solution {
    boolean solution(String s) {
        boolean answer = true;
        Stack<Character> stack = new Stack<>();

        for(char str : s.toCharArray()){
            if(stack.isEmpty() || str == '('){
                stack.push(str);
            }
            else{
                if(stack.peek() == '('){
                    stack.pop();
                }
                else{
                    stack.push(str);
                }
            }
        }
        if(stack.isEmpty()){
            answer = true;
        }
        else{
            answer = false;
        }

        return answer;
    }
}