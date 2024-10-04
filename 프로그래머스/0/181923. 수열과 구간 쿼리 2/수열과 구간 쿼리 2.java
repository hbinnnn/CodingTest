import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];        
        int[] list = {};
        
        for(int i=0;i<queries.length;i++){
            int[] query = queries[i];
            list = Arrays.copyOfRange(arr, query[0], query[1]+1);
            Arrays.sort(list);
            for(int num:list){
                if(num > query[2] && answer[i] == 0){
                    answer[i] = num;
                }
            }
            if(answer[i] == 0){
                answer[i] = -1;
            }
        }
        
        return answer;
    }
}