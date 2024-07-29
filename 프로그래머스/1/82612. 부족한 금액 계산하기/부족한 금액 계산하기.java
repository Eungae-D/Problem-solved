class Solution {
    public long solution(int price, int money, int count) {
        long answer = 0;
        
        long moneyCnt = 0;
        for(int i = 1 ; i <= count ; i++){
            moneyCnt += i*price;
        }
        
        long lessMoney = 0;
        lessMoney = money-moneyCnt;
        if(lessMoney < 0){
            answer = moneyCnt-money;
        }else{
            answer = 0;
        }
        return answer;
    }
}