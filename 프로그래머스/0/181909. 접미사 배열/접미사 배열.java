import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public String[] solution(String my_string) {
        String[] answer = {};
        ArrayList<String> strList = new ArrayList<>();
        
        for(int i=0;i<my_string.length();i++){
            strList.add(my_string.substring(i, my_string.length()));
        }
        Collections.sort(strList);
        
        answer = new String[strList.size()];
        
        for(int j=0;j<strList.size();j++){
            answer[j] = strList.get(j);
        }
        return answer;
    }
}