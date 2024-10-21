class Solution {
    public int[] solution(String s) {
        int[] answer = new int[2];
        
        while(s.length() > 1){
            int num = 0;
            for(char c : s.toCharArray()){
                if(c == '0'){
                    answer[1]++;
                }      
                else{
                    num++;
                }
            }
            answer[0]++;
            s = Integer.toBinaryString(num);
        }
        return answer;
    }
}