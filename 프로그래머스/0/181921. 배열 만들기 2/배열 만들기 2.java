import java.util.ArrayList;

class Solution {
    public int[] solution(int l, int r) {
        int[] answer = {};
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i=l;i<=r;i++){
            if(i % 5 == 0){
                int chkCnt = 0;
                String chkNum = i+"";
                String[] numStr = chkNum.split("");
                for(String s : numStr){
                    if(s.equals("0") || s.equals("5")){
                        chkCnt++;
                    }
                }
                if(chkCnt == numStr.length){
                    list.add(i);
                }
            }
        }
        if(list.size() == 0){
            return new int[] {-1};
        }
        else{
            answer = new int[list.size()];
            for(int j=0;j<list.size();j++){
                answer[j] = list.get(j);
            }
        }
        return answer;
    }
}