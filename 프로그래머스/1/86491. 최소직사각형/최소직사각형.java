class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        int width = 0;
        int height = 0;
        
        for(int[] n : sizes){
            width = Math.max(width, Math.max(n[0], n[1]));
            height = Math.max(height, Math.min(n[0], n[1]));
        }
        
        answer = width * height; 
        
        return answer;
    }
}