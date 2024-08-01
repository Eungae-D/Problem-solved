class Solution {
    private static String[] days = {"FRI","SAT","SUN","MON","TUE","WED","THU"};
    private static int[] months = {31,29,31,30,31,30,31,31,30,31,30,30};
    public String solution(int a, int b) {
        int total = 0;
        
        for(int i = 0 ; i < a-1; i++){
            total+=months[i];
        }
        total+=b-1;
        
        return days[total%7];
    }
}