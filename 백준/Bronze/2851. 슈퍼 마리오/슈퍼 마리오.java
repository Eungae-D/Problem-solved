import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    private static StringBuilder sb;
    private static BufferedReader br;
    private static StringTokenizer st;
    private static int[] arr;
    private static int sum = 0;
    private static int height,nextHeight,heightABS,nextHeightABS;

    //입력
    public static void input() throws Exception {
        br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();

        arr = new int[10];
        for(int i = 0 ; i < 10 ; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }
    }

    //실행
    public static void process() {
        for(int i = 0 ; i < 10 ; i++){
            sum += arr[i];
            if(sum<=100){
                height = sum;
            }else{
                nextHeight = sum;
                break;
            }
        }

        heightABS = Math.abs(100-height);
        nextHeightABS = Math.abs(100 - nextHeight);

        if(heightABS > nextHeightABS){
            System.out.println(nextHeight);
        }else if(heightABS < nextHeightABS){
            System.out.println(height);
        }else{
            System.out.println(nextHeight);
        }
    }


    public static void main(String[] args) throws Exception {
        input();
        process();
    }
}
