import java.util.Arrays;

class Solution {
    public String solution(String s) {
        String answer = "";
        String[] strArr = s.split(" ");
        int[] nums = new int[strArr.length];
        
        for(int i=0;i<nums.length;i++){
            nums[i] = Integer.parseInt(strArr[i]);
        }
        Arrays.sort(nums);
        
        answer = nums[0] + " " + nums[nums.length-1];
        
        return answer;
    }
}