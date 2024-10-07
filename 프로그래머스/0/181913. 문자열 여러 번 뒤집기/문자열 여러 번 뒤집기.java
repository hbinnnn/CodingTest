class Solution {
    public String solution(String my_string, int[][] queries) {
        
        StringBuilder str = new StringBuilder(my_string);
        
        for(int[] query : queries){
            int startIdx = query[0];
            int endIdx = query[1];
            
            StringBuilder sb = new StringBuilder(str.substring(startIdx, endIdx+1));
            
            sb.reverse();
            str.replace(startIdx, endIdx+1, sb.toString());
        }
        return str.toString();
    }
}