import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class Main {
    private static StringBuilder sb;
    private static BufferedReader br;
    private static StringTokenizer st;
    private static int N;
    private static int[] arr;
    private static TreeSet<Integer> set = new TreeSet<Integer>();
    private static int answer = 0 ;


    //입력
    public static void input() throws Exception {
        br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();

        N = Integer.parseInt(br.readLine());

        arr = new int[N];
        for(int i = 0 ; i < N ; i++){
            arr[i] = Integer.parseInt(br.readLine());
            set.add(arr[i]);
        }
    }

    //실행
    public static void process() {
        for(int i : set){
            int count = 0;
            int temp = -1;

            for(int j = 0 ; j < N ; j++){
                if(arr[j] == i) continue;

                if(arr[j] != temp){
                    answer = Math.max(answer, count);
                    temp = arr[j];
                    count = 1;
                }else{
                    count++;
                }
            }
            answer = Math.max(answer,count);
        }
        System.out.println(answer);
    }


    public static void main(String[] args) throws Exception {
        input();
        process();
    }
}
