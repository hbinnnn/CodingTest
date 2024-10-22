import java.util.Arrays;
class Solution {
    public int solution(int[] diffs, int[] times, long limit) {
        int answer = 0;
        
        int min = 1;
        int max = 100000;
        
        while(min <= max){
            int level = (min+max) / 2;
            long totalTime = getTotalTime(diffs, times, level);
            
            if(totalTime <= limit){
                answer = level;
                max = level -1;
            }
            if(totalTime > limit){
                min = level +1;
            }
        }        
        return answer;
    }
    
    public static long getTotalTime(int[] diffs, int[] times, int level){
        long totalTime = 0;
        
        for(int i=0;i<diffs.length;i++){
            int solveTime = diffs[i] - level;
            if(solveTime <= 0){
                totalTime += times[i];
            }
            else{
                if(i > 0){
                    totalTime += (long)(solveTime*(times[i]+times[i-1])) + times[i];
                }
                else{
                    totalTime += (long)(solveTime*times[i]) + times[i];
                }
            }
        }
        return totalTime;
    }
}