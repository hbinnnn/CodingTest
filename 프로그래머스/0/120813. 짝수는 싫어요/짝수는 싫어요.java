import java.util.ArrayList;

class Solution {
    public int[] solution(int n) {
        int[] answer = {};
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i=1;i<=n;i+=2){
            list.add(i);
        }
        answer = new int[list.size()];
        
        for(int j=0;j<list.size();j++){
            answer[j] = list.get(j);
        }
        return answer;
    }
}