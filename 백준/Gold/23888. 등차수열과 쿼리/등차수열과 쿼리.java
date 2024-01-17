import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static long a;
    public static long d;
    public static long q;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

         a = sc.nextLong();
         d = sc.nextLong();

         q = sc.nextLong();

        for(int tc = 0 ; tc<q ; tc++){
            long sumOrGCD = sc.nextInt();
            long l = sc.nextInt();
            long r = sc.nextInt();
            if(sumOrGCD==1){
                long sum = (sumSequence(r)-sumSequence(l-1));
                sb.append(sum+"\n");
            }else{
                if(l==r){
                    sb.append((a+(l-1)*d)+"\n");
                }else{
                    sb.append((gcd(a+(l-1)*d,d))+"\n");
                }

            }
        }
        System.out.println(sb);
    }
    public static long sumSequence(long n){
        return (n * (2*a+(n-1)*d))/2;
    }
    public static long gcd(long x, long y){
        while(y!=0){
            long temp = x%y;
            x = y;
            y =temp;
        }
        return x;
    }
}
