class Solution {
    public String solution(String s) {
        String answer = "";
        String[] str = s.split(" ");
        
        for(int i=0;i<str.length;i++){
            String word = str[i];
            
            if(word.length() == 0){
                answer += " ";
            }
            else{
                answer += word.substring(0, 1).toUpperCase();
                answer += word.substring(1, word.length()).toLowerCase();
                answer += " ";
            }
        }
        
        if(s.substring(s.length()-1, s.length()).equals(" "))
            return answer;
        else
            return answer.substring(0, answer.length()-1);
    }
}