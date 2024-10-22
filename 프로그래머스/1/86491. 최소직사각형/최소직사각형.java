class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        
        for(int i=0;i<sizes.length;i++){
            if(sizes[i][0] < sizes[i][1]){
                int temp = sizes[i][1];
                sizes[i][1] = sizes[i][0];
                sizes[i][0] = temp;
            }
        }
        
        int width = 0;
        int height = 0;
        
        for(int[] n : sizes){
            width = Math.max(width, n[0]);
            height = Math.max(height, n[1]);
        }
        
        answer = width * height; 
        
        return answer;
    }
}