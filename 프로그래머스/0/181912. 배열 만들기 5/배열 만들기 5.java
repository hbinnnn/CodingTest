import java.util.ArrayList;

class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        int[] answer = {};
        ArrayList<Integer> arrInt = new ArrayList<>();
        
        for(String str : intStrs){  
            int num = Integer.parseInt(str.substring(s, s+l));
            if(k < num) {
                arrInt.add(num);   
            }
        }
        answer = new int[arrInt.size()];
        for(int i=0;i<arrInt.size();i++){
            answer[i] = arrInt.get(i);   
        }
        return answer;
    }
}