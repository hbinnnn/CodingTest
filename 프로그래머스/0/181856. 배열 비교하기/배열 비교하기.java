class Solution {
    public int solution(int[] arr1, int[] arr2) {
        int answer = 0;
        
        if(arr1.length > arr2.length){
            return 1;
        }
        else if(arr1.length < arr2.length){
            return -1;
        }
        else{
            int sum1 = 0, sum2 = 0;
            for(int x : arr1){
                sum1 += x;
            }   
            for(int y : arr2){
                sum2 += y;
            }
            return sum1 == sum2 ? 0: sum1 > sum2 ? 1 : -1;
        }
    }
}