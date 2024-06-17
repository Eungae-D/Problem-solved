import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    private static StringBuilder sb;
    private static BufferedReader br;
    private static StringTokenizer st;
    private static int N;
    private static String[] list;
    private static int[] arr;
    private static boolean[] visited = new boolean[10];
    private static ArrayList<String> answer = new ArrayList<>();

    //입력
    public static void input() throws Exception {
        br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();
        st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        list = br.readLine().split(" ");
        arr = new int[N+1];
    }
    public static void recur(int cur){
        if(cur == N+1){
            String tmp = "";
            for(int i = 0 ; i < arr.length ; i++){
                tmp+=arr[i];
            }
            answer.add(tmp);
            return;
        }

        for(int i = 0 ; i < 10 ; i++){
            if(visited[i]) continue;

            if(cur>0){
                if(list[cur-1].equals(">")){
                    if(i > arr[cur-1]) continue;
                }else if(list[cur-1].equals("<")){
                    if(i < arr[cur-1]) continue;
                }
            }

            visited[i] = true;
            arr[cur] = i;
            recur(cur+1);
            visited[i] = false;
        }


    }

    //실행
    public static void process() {
        recur(0);
        System.out.println(answer.get(answer.size()-1));
        System.out.println(answer.get(0));
    }


    public static void main(String[] args) throws Exception {
        input();
        process();
    }
}