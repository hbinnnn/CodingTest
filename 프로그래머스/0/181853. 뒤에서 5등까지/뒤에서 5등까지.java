import java.util.Arrays; 
class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = {};
        
        Arrays.sort(num_list);
        answer = Arrays.copyOf(num_list, 5);
        return answer;
    }
}