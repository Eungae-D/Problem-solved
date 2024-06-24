
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    private static StringBuilder sb;
    private static BufferedReader br;
    private static StringTokenizer st;
    private static int N,M,K;
    private static int[][] quests;
    private static boolean[] selectSkills;
    private static int answer = 0;


    public static void input() throws Exception {
        br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();
        st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        quests = new int[M][K];
        for(int i = 0 ; i < M ; i++){
            st = new StringTokenizer(br.readLine());
            for(int j = 0 ; j < K ; j++){
                quests[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        selectSkills = new boolean[2*N+1];
    }

    public static void process() {
        recur(0,1);

        System.out.println(answer);
    }

    public static int calQuests(){
        int count = 0;
        for(int i = 0 ; i < M; i++){
            boolean flag = true;
            for(int j = 0 ; j < K ; j++){
                if(!selectSkills[quests[i][j]]){
                    flag = false;
                    break;
                }
            }
            if(flag) count++;
        }
        return count;
    }

    public static void recur(int cur, int start){
        if(cur==N){
            int quest  = calQuests();
            answer = Math.max(answer,quest);
            return;
        }

        for(int i = start; i<2*N+1; i++){
            selectSkills[i] = true;
            recur(cur+1,i+1);
            selectSkills[i] = false;
        }
    }

    public static void main(String[] args) throws Exception {
        input();
        process();
    }
}
