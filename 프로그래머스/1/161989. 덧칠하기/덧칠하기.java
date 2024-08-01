class Solution {
    public int solution(int n, int m, int[] section) {
        //그리디
        //배열 두고 할까? 아님 걍해? 걍하자
        int answer = 1;
        int start = section[0]+m;
        
        for(int i = 1 ; i < section.length ; i++){
            if(section[i]<start) continue;
            else{
                answer++;
                start = section[i]+m;
            }
        }
        
        
        return answer;
    }
}