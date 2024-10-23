class Solution {
    public String solution(int[] food) {
        String answer = "";
        
        for(int i=0;i<food.length;i++){
            if(food[i] >= 2){
                for(int j=0;j<food[i]/2;j++){
                    answer += i;
                }
            }
        }
        StringBuilder sb = new StringBuilder(answer);
        
        answer += "0" + sb.reverse().toString();
        
        return answer;
    }
}