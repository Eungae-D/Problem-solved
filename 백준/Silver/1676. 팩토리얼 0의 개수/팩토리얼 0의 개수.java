
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //이 문제는 1!부터 10! 까지 소인수 분해하면 정답이 보인다.
        int input = sc.nextInt();

        //bigInteger로 풀수 있지만 그것보단 dp처럼 규칙이 있다.
        int cntF = 0;
        while(input>=5){
            cntF +=input/5;
            input=input/5;
        }
        System.out.println(cntF);


    }
}
