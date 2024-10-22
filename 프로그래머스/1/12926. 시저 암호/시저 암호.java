class Solution {
    public String solution(String s, int n) {
        String answer = "";
        
        for(char c : s.toCharArray()){
            if(c == ' '){
                answer += " ";
            }
            else{
                if(c >= 'a' && c <= 'z'){
                    if(c+n > 'z'){
                        answer += (char)(c-26+n);
                    }
                    else{
                        answer += (char)(c+n);   
                    }
                }
                if(c >= 'A' && c <= 'Z'){
                    if(c+n > 'Z'){
                        answer += (char)(c-26+n);
                    }
                    else{
                        answer += (char)(c+n);   
                    }
                }
            }
        }
        return answer;
    }
}