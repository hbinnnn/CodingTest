class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        
        int area = brown + yellow;
        
        for(int i=3;i<=area;i++){
            int h = i;
            int w = area / h;
            
            if(w < 3) {
                continue;
            }
            if(w >= h){
                if( (w-2)*(h-2) == yellow){
                    answer[0] = w;
                    answer[1] = h;
                    break;
                }
            }
        }
        return answer;
    }
}