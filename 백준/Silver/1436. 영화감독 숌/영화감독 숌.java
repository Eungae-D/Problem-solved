import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //브루트포스
        //효율이 좋지 않음.
        int input = sc.nextInt();

        int number = 666;
        int cnt = 1;

        while (input != cnt){
            number++;
            if(String.valueOf(number).contains("666")){
                cnt++;
            }
        }

        System.out.println(number);


    }
}