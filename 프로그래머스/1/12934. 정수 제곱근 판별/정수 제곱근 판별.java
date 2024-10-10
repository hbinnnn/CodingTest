class Solution {
    public long solution(long n) {
        long answer = -1;
        
        long x = 1;
        
        while((x*x) <= n){
            if((x*x) == n){
                answer = (x+1)*(x+1);    
                break;
            }
            x++;
        }
        return answer;
    }
}