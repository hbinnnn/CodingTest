import java.util.Arrays;

class Solution {
    public String solution(String number, int k) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        
        int idx = 0;
        
        for(int i=0;i<number.length()-k;i++){
            int max = 0;
            for(int j=idx;j<=i+k;j++){
                if(max < number.charAt(j)-'0'){
                    max = number.charAt(j)-'0';
                    idx = j+1;
                }
            }
            sb.append(max);
        }
        
        return sb.toString();
    }
}