class Solution {
    public String solution(String s) {
        String answer = "";
        
        String[] arr = s.split("");
        int cnt = 0;
        for(String ss : arr){
            System.out.println(ss);
            if(ss.contains(" ")){
                cnt = 0;
            }else{
                cnt++;
            }
            
            if(cnt%2==0){
                answer+=ss.toLowerCase();
            }else{
                answer+=ss.toUpperCase();
            }
        }
        return answer;
    }
}