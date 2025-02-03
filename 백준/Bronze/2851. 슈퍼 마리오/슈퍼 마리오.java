import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    private static BufferedReader br;
    private static StringTokenizer st;
    private static StringBuilder sb;
    private static int[] arr = new int[10];
    private static int sum = 0;
    private static int height,nextHeight;

    public static void input() throws Exception {
        br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();

        for(int i = 0 ; i < 10; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }

    }

    public static void process(){
        for(int i = 0 ; i < 10; i++){
            sum+=arr[i];
            if(sum <= 100){
                height = sum;
            }else{
                nextHeight = sum;
                break;
            }
        }


        if(Math.abs(100-height)== Math.abs(100-nextHeight)) System.out.println(nextHeight);
        else if(Math.abs(100-height) < Math.abs(100-nextHeight)) System.out.println(height);
        else System.out.println(nextHeight);
    }

    public static void main(String[] args) throws Exception{
        input();
        process();
    }
}
