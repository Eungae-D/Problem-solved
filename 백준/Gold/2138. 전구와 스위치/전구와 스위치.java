import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    private static StringBuilder sb;
    private static BufferedReader br;
    private static StringTokenizer st;
    private static int N;
    private static int[]arr, arr2;
    private static int[] target;
    private static int touch,touch2 = 0;
    private static int answer = Integer.MAX_VALUE;

    public static void input() throws Exception {
        br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();

        N = Integer.parseInt(br.readLine());

        arr = new int[N];
        arr2 = new int[N];
        target = new int[N];

        String line = br.readLine();
        for(int i = 0 ; i < N; i++){
            arr[i] = line.charAt(i)-'0';
            arr2[i] = arr[i];
        }

        line = br.readLine();
        for(int i = 0 ; i < N ; i++){
            target[i] = line.charAt(i) - '0';
        }

        arr2[0] = arr2[0] == 1 ? 0 : 1;
        arr2[1] = arr2[1] == 1 ? 0 : 1;
        touch2++;

    }

    public static void process() {
        //    000 -> 010
        //    000 -> 1번 안고름
        //    000 -> 2번 안고름
        //    011 -> 3번 고름

        //    110 -> 1번 첫번쨰 고름
        //    001 -> 2번 고름
        //    010 -> 3번 고름

        //0000
        //1111

        for(int i = 1; i < N; i++){
            //1번스위치 안누른것
            if(arr[i-1] != target[i-1]){
                touch++;
                if( i == N-1){
                    arr[i-1] = arr[i-1] == 1 ? 0 : 1;
                    arr[i] = arr[i] == 1 ? 0 : 1;
                }else{
                    arr[i-1] = arr[i-1] == 1 ? 0 : 1;
                    arr[i] = arr[i] == 1 ? 0 : 1;
                    arr[i+1] = arr[i+1] == 1 ? 0 : 1;
                }
            }

            //1번 스위치 누른것
            if(arr2[i-1] != target[i-1]){
                touch2++;
                if( i == N-1){
                    arr2[i-1] = arr2[i-1] == 1 ? 0 : 1;
                    arr2[i] = arr2[i] == 1 ? 0 : 1;
                }else{
                    arr2[i-1] = arr2[i-1] == 1 ? 0 : 1;
                    arr2[i] = arr2[i] == 1 ? 0 : 1;
                    arr2[i+1] = arr2[i+1] == 1 ? 0 : 1;
                }
            }
        }

        if(arr[N-1] != target[N-1]){
            touch = Integer.MAX_VALUE;
        }
        if(arr2[N-1] != target[N-1]){
            touch2 = Integer.MAX_VALUE;
        }
        answer = Math.min(touch,touch2);

        if(answer == Integer.MAX_VALUE){
            System.out.println(-1);
        }else{
            System.out.println(answer);
        }
    }


    public static void main(String[] args) throws Exception {
        input();
        process();
    }
}