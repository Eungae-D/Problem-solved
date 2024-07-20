import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    private static StringBuilder sb;
    private static BufferedReader br;
    private static StringTokenizer st;
    private static int N;
    private static int pre,now,mid;

    //입력
    public static void input() throws Exception {
        br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();

        N = Integer.parseInt(br.readLine());
        pre = 0;
        now = 3;
        mid = 3;
    }

    //실행
    public static void process() {
        while(N>now){
            pre = now;
            now = now*2+(mid+1);
            mid++;
        }

        while(true){
            if(pre<N && N<=pre+mid){
                N = N-pre;
                break;
            }
            //오른쪽 구간
            if(N>pre+mid){
                now = pre;
                N=N-(pre+mid);
                mid--;
                pre = (now-mid)/2;

            }else if(N<=pre){ //왼쪽구간
                now = pre;
                mid--;
                pre = (now-mid)/2;
            }
        }
        if(N==1) System.out.println("m");
        else System.out.println("o");
    }


    public static void main(String[] args) throws Exception {
        input();
        process();
    }
}