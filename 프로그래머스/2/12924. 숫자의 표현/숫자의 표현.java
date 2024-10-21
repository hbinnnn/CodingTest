class Solution {
    public int solution(int n) {
        int answer = 0;
        
        int startNum = 1;
        while(startNum <= n){
            int sum = 0;
            for(int i=startNum;i<=n;i++){
                sum += i;
                
                if(sum == n){
                    answer++;
                    break;
                }
                if(sum > n){
                    break;
                }
            }
            startNum++;
        }
        return answer;
    }
}