class Solution {
    public int solution(int[] array, int height) {
        int answer = 0;
        
        for(int friend : array){
            answer += friend > height ? 1 : 0;
        }
        return answer;
    }
}