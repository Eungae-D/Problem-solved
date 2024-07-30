class Solution {
    public int solution(String t, String p) {
        int length = t.length() - p.length() + 1;
        long pNum = Long.parseLong(p);
        int answer = 0;
        
        for (int i = 0; i < length; i++) {
            
            String temp = "";
            for(int j = 0 ; j < p.length(); j++){
                temp+=String.valueOf(t.charAt(i+j));
            }
            
            if(Long.parseLong(temp)<=pNum){
                answer++;
            }
            
            
        }
        return answer;
    }
}