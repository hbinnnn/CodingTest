import java.util.Arrays;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        
        int[] student = new int[n];
        Arrays.fill(student, 1);
        
        for(int l : lost){
            student[l-1] -= 1;
        }
        
        for(int r : reserve){
            student[r-1] += 1;
        }
        
        for(int i=0;i<student.length;i++){
            if(student[i] == 2){
                if(i-1 >= 0 && student[i-1] == 0){
                    student[i] = 1;
                    student[i-1] = 1;
                }
                else if(i+1 < student.length && student[i+1] == 0){
                    student[i] = 1;
                    student[i+1] = 1;
                }
            }
        }
        for(int s : student){
            answer += s > 0 ? 1 : 0;
        }
            
        return answer;
    }
}