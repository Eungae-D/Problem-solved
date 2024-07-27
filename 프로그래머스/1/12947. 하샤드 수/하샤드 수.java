class Solution {
    public boolean solution(int x) {
        int first = x;
        
        int hashad = 0;
        
        while(x>0){
            hashad += x%10;
            x = x/10;
        }
        
        if(first%hashad == 0){
            return true;
        }else{
            return false;
        }
    }
}