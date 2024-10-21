import java.util.Arrays;

class Solution {
    public int solution(int[] d, int budget) {
        int answer = 0;
        
        Arrays.sort(d);
        
        for(int dep : d){
            budget -= dep;
            if(budget >= 0){
                answer++;
            }
            else{
                break;
            }
        }
        return answer;
    }
}