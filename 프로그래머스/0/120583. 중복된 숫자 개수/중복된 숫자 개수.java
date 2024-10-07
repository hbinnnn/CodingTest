import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public int solution(int[] array, int n) {
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int num : array){
            list.add(num);
        }
        
        return Collections.frequency(list, n);
    }
}