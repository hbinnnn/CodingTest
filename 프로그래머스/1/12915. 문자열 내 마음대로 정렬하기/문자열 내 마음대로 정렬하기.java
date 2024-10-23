import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public String[] solution(String[] strings, int n) {
        String[] answer = {};
        
        ArrayList<String> list = new ArrayList<>();
        
        for(int i=0;i<strings.length;i++){
            list.add(i, strings[i].substring(n,n+1)+","+strings[i]);
        }
        Collections.sort(list);
        
        answer = new String[list.size()];
        for(int j=0;j<list.size();j++){
            answer[j] = list.get(j).split(",")[1];
        }
        
        return answer;
    }
}