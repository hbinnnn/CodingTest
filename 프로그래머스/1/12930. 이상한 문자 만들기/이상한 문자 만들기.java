class Solution {
    public String solution(String s) {
        String answer = "";
        
        String[] str = s.split(" ", -1);
        
        for(String word : str){
            for(int i=0;i<word.length();i++){
                if(word.charAt(i) == ' '){
                    answer += " ";
                }
                else if(i%2==0){
                    answer += Character.toUpperCase(word.charAt(i));
                }
                else{
                    answer+= Character.toLowerCase(word.charAt(i));   
                }
            }
            answer += " ";
        }
        answer = answer.substring(0, answer.length()-1);
        
        return answer;
    }
}