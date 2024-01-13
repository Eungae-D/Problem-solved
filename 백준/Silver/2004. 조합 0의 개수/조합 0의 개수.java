import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();
        long m = sc.nextLong();

        long fiveCnt = fiveCount(n)-fiveCount(n-m)-fiveCount(m);
        long twoCnt = twoCount(n)-twoCount(n-m)-twoCount(m);

        System.out.println(Math.min(fiveCnt,twoCnt));
    }

    public static long fiveCount(long input){
        long count = 0 ;

        for(long i = 5 ; i <=input; i *= 5){
            if(input ==0){
                return 0;
            }
            count += input/i;
        }

        return count;
    }

    public static long twoCount(long input){
        long count = 0 ;

        for(long i = 2 ; i <=input; i *= 2){
            if(input ==0){
                return 0;
            }
            count += input/i;
        }
        return count;
    }
}
