class Solution {
    public int solution(String number) {
        int answer = 0;
        
        for(char x : number.toCharArray()){
            answer += Integer.parseInt(x+"");
        }
        return answer % 9;
    }
}