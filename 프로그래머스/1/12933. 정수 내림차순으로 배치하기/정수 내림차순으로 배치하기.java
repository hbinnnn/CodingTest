import java.util.Arrays;

class Solution {
    public long solution(long n) {
        long answer = 0;
        
        String strNum = Long.toString(n);
        String[] str = strNum.split("");
        long[] num = new long[str.length];
        
        for(int i=0;i<num.length;i++){
            num[i] = Long.valueOf(str[i]);
        }
        Arrays.sort(num);
        
        String reverseNum = "";
        
        for(int j=num.length-1;j>=0;j--){
            reverseNum += num[j]+"";
        }
        answer = Long.valueOf(reverseNum);
        
        return answer;
    }
}