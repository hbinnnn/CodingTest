class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = {};
        String[] a1 = new String[arr1.length];
        String[] a2 = new String[arr2.length];
        
        for(int i=0;i<arr1.length;i++){
            String s1 = Integer.toString(arr1[i], 2);
            a1[i] = String.format("%"+n+"s", s1).replace(" ", "0");
            
            String s2 = Integer.toString(arr2[i], 2);
            a2[i] = String.format("%"+n+"s", s2).replace(" ", "0");
        }
        
        answer = new String[a1.length];
        for(int j=0;j<a1.length;j++){
            String str = "";
            char[] c1 = a1[j].toCharArray();
            char[] c2 = a2[j].toCharArray();
            for(int k=0;k<c1.length;k++){
                if(c1[k] == '0' && c2[k] == '0'){
                    str += " ";
                }
                else{
                    str += "#";
                }
            }
            answer[j] = str;
        }
        
        return answer;
    }
}