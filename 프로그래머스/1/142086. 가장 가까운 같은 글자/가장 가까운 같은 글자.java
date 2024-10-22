class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        
        String word = "";
        
        for(int i=0;i<s.length();i++){
            String alpha = s.charAt(i) + "";
            if(!word.contains(alpha)){
                answer[i] = -1;
                word += alpha;
            }
            else{
                answer[i] = i - word.lastIndexOf(alpha);
                word += alpha;
            }
            
        }
        return answer;
    }
}