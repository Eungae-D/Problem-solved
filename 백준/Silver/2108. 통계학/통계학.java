import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    private static StringBuilder sb;
    private static BufferedReader br;
    private static StringTokenizer st;
    private static int N;
    private static int[] arr = new int[8010];
    private static int sum; //산술평균 //OK
    private static int mid; //중앙값 //OK
    private static int count; // 최빈값
    private static int max = Integer.MIN_VALUE; //범위
    private static int min = Integer.MAX_VALUE; //범위

    //입력
    public static void input() throws Exception {
        br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();

        N = Integer.parseInt(br.readLine());

        for(int i = 0 ; i < N ; i++){
            int input = Integer.parseInt(br.readLine());

            arr[input+4000]++;
            sum += input;

            if(input > max){
                max = input;
            }

            if(input < min){
                min = input;
            }
        }
    }

    //실행
    public static void process() {
        int midCount = 0 ;
        int recentCnt = 0;
        boolean flag = false;

        for(int i = min+4000 ; i <= max+4000 ; i++){
            if(arr[i] > 0){
                //중앙값
                if(midCount < (N+1)/2){
                    midCount += arr[i];
                    mid = i-4000;
                }

                //최빈값
                if(recentCnt < arr[i]){
                    recentCnt = arr[i];
                    count = i-4000;
                    flag = true;
                }else if(flag == true && recentCnt == arr[i]){
                    count = i-4000;
                    flag = false;
                }
            }
        }

        System.out.println((int)Math.round((float)sum/N));
        System.out.println(mid);
        System.out.println(count);
        System.out.println(max-min);
    }


    public static void main(String[] args) throws Exception {
        input();
        process();
    }
}
