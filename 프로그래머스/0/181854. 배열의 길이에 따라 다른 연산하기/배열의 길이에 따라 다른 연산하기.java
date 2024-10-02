class Solution {
    public int[] solution(int[] arr, int n) {
        int[] answer = {};
        answer = arr;
        int startIdx = 0;
        
        if(arr.length%2 == 0){
            startIdx = 1;
        }
        
        for(int i=startIdx;i<arr.length;i+=2){
            answer[i] = answer[i]+n;
        }
        return answer;
    }
}