import java.util.Arrays;

class Solution {
    public int solution(String s) {
        int answer = 0;
        String result = "";
        
        String[] numbers = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        
        String word = "";
        
        for(char c : s.toCharArray()){
            if(Character.isDigit(c)){
                result += c;
            }
            else{
                word += c;
                if(Arrays.asList(numbers).indexOf(word) > -1){
                    result += Arrays.asList(numbers).indexOf(word);
                    word = "";
                }
            }
        }
        answer = Integer.valueOf(result);
        
        return answer;
    }
}