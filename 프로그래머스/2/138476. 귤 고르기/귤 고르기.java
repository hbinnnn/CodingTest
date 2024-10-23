import java.util.*;

class Solution {
    public int solution(int k, int[] tangerine) {
        int answer = 0;
        
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int size : tangerine){
            map.put(size, map.getOrDefault(size, 0)+1);
        }
        List<Integer> keySet = new ArrayList<>(map.keySet());
        keySet.sort((o1, o2) -> map.get(o2).compareTo(map.get(o1)));

        for (Integer key : keySet) {
			k -= map.get(key);
            answer++;
            
            if(k <= 0){
                break;
            }
		}
        
        return answer;
    }
}