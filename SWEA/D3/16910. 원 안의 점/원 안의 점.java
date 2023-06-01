import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        int T  =sc.nextInt();
        for(int tc = 1; tc<=T ;tc++){
            int input = sc.nextInt();

            int cnt = 0;
            for(int i = -input; i<=input; i++){
                for(int j = -input ; j <=input ; j++){
                    if((i*i)+(j*j)<=input*input){
                        cnt++;
                    }
                }
            }
            System.out.println("#"+tc+" "+cnt);

        }

    }
}