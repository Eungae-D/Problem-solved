class Solution {
    
    public static int gcd(int a, int b){
        while(a%b!=0){
            int temp = a%b;
            a = b;
            b = temp;
        }
        return b;
    }
    
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        
        int gcd = gcd(n,m);
        int min = (n*m)/gcd;
        
        answer[0] = gcd;
        answer[1] = min;
        
        return answer;
    }
}