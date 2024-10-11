class Solution {
    public String solution(String phone_number) {
        String replaceStr = "";
        
        for(int i=0;i<phone_number.length()-4;i++)
            replaceStr += "*";
        
        return phone_number.replace(phone_number.substring(0, phone_number.length()-4), replaceStr);
    }
}