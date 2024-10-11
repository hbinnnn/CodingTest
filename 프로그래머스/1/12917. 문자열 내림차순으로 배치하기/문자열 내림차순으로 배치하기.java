import java.util.Arrays;

class Solution {
    public String solution(String s) {
        
        char[] charArr = s.toCharArray();
        Arrays.sort(charArr);
        
        StringBuilder sb = new StringBuilder(String.valueOf(charArr));
        sb.reverse();
        
        return sb.toString();
    }
}