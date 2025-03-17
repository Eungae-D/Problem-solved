import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    private static BufferedReader br;
    private static StringBuilder sb;
    private static StringTokenizer st;
    private static int N,K;
    private static boolean[] visited;
    private static String[] arr;
    private static ArrayList<String> list;

    public static void input() throws Exception {
        br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();

        N = Integer.parseInt(br.readLine());
        K = Integer.parseInt(br.readLine());

        visited = new boolean[N];
        list = new ArrayList<String>();

        arr = new String[N];
        for(int i = 0 ; i < N ; i++){
            arr[i] = br.readLine();
        }
    }
    public static void recur(int cur, String temp){
        if(cur == K){
            if(!list.contains(temp)){
                list.add(temp);
            }
            return;
        }

        for(int i = 0 ; i < N ; i++){
            if(!visited[i]){
                visited[i] = true;
                recur(cur+1,temp+arr[i]);
                visited[i] = false;
            }
        }
    }

    public static void process(){
        recur(0,"");
        System.out.println(list.size());
    }

    public static void main(String[] args) throws Exception{
        input();
        process();
    }
}
