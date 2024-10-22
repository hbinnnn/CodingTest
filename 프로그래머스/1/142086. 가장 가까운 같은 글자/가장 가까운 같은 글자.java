class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        
        String word = "";
        
        for(int i=0;i<s.length();i++){
            String alpha = s.charAt(i) + "";
            if(!word.contains(alpha)){
                word += alpha;
                answer[i] = -1;
            }
            else{
                for(int j=word.length()-1;j>=0;j--){
                    if(word.charAt(j) == s.charAt(i)){
                        word += alpha;
                        answer[i] = i-j;
                        break;
                    }
                }
            }
            
        }
        return answer;
    }
}