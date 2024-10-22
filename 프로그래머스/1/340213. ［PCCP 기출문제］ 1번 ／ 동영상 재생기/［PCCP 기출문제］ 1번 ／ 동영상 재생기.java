class Solution {
    public static int timeToNum(String time){
        int mm = Integer.parseInt(time.split(":")[0]);
        int ss = Integer.parseInt(time.split(":")[1]);
        
        return (mm * 60)+ss;
    }
    
    public String solution(String video_len, String pos, String op_start, String op_end, String[] commands) {
        String answer = "";
        int posTime = timeToNum(pos);
        int startTime = timeToNum(op_start);
        int endTime = timeToNum(op_end);
        int lenTime = timeToNum(video_len);
        
        for(String com : commands){
            
            switch(com){
                case "prev":
                    if(posTime-10 < 0){
                        posTime = 0;
                    }
                    else if(posTime >= startTime && posTime < endTime){
                        posTime = endTime;
                    }
                    else{
                        posTime-=10;
                    }
                break;
                case "next":
                    if(posTime >= startTime && posTime < endTime){
                        posTime = endTime;
                        posTime += 10;
                    }
                    else if(posTime+10 >= startTime && posTime+10 <= endTime){
                        posTime = endTime;
                    }
                    else{
                        posTime += 10;
                    }
                    if(posTime > lenTime){
                        posTime = lenTime;
                    }
                    break;
            }
        }
        String min = String.valueOf(posTime / 60);
        String second = String.valueOf(posTime % 60);
        if(min.length() == 1){
            min = "0" + min;
        }
        if(second.length() == 1){
            second = "0"+second;
        }
        answer = min+":"+second;
        return answer;
    }
}