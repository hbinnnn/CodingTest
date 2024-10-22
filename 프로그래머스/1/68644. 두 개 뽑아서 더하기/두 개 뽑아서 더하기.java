import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public int[] solution(int[] numbers) {
        int[] answer = {};
        
        ArrayList<Integer> list = new ArrayList<Integer>();
        
        for(int i=0;i<numbers.length;i++){
            for(int j=i+1;j<numbers.length;j++){
                if(!list.contains(numbers[i]+numbers[j])){
                    list.add(numbers[i]+numbers[j]);   
                } 
            }
        }
        
        answer = new int[list.size()];
        
        for(int k=0;k<list.size();k++){
            answer[k] = list.get(k);
        }
        Arrays.sort(answer);
        
        return answer;
    }
}