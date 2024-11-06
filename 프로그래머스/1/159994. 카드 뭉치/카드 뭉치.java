import java.util.Arrays;

class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        String result = "";
        
        int idx1 = 0;
        int idx2 = 0;
        
        for(String s : goal){
            result = "No";
            
            if(Arrays.asList(cards1).indexOf(s) == idx1){
                idx1++;
                result = "Yes";
            }
            else if(Arrays.asList(cards2).indexOf(s) == idx2){
                idx2++;
                result = "Yes";
            }
            if(result.equals("No")){
                return result;
            }
        }
        return result;
    }
}