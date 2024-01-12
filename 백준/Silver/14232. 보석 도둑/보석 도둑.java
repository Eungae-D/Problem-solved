import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long k = sc.nextLong();
        int cnt = 0;
        ArrayList<Long> list = new ArrayList<>();

        long temp = 2;
        while(k!=1){
            //제곱근보다 클때까지 나누어 지는 값이 없음.(소수)
            if(temp>=1000000){
                list.add(k);
                cnt++;
                break;
            }
            if(k%temp==0){
                cnt++;
                k /=temp;
                list.add(temp);
            }
            else{
                temp++;
            }
        }
        System.out.println(cnt);
        for(int i = 0 ; i < list.size(); i++){
            System.out.print(list.get(i)+" ");
        }
    }
}
