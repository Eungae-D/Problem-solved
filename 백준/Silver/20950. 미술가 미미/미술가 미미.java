import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    private static StringBuilder sb;
    private static BufferedReader br;
    private static StringTokenizer st;
    private static int N;
    private static int[][]paints;
    private static int[][]ans;
    private static int[]gomColor = new int[3];
    private static boolean[] visited;
    private static int moonColor = Integer.MAX_VALUE;

    public static void input() throws Exception {
        br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();
        st = new StringTokenizer(br.readLine());

        N= Integer.parseInt(st.nextToken());

        paints = new int[N][3];
        visited = new boolean[N];

        for(int i = 0 ; i < N ; i++){
            st = new StringTokenizer(br.readLine());
            for(int j = 0 ; j < 3; j++){
                paints[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < 3; i++) {
            gomColor[i] = Integer.parseInt(st.nextToken());
        }

    }

    public static void process() {
        recur(0,0);
    }

    public static void recur(int cur,int count){
        if(count>1 && count<=7 ){
            calculate();
        }
        if(cur==N ||count ==7) return;

        //현재 물감 포함
        visited[cur] = true;
        recur(cur+1,count+1);

        //현재 물감 불포함
        visited[cur] =false;
        recur(cur+1,count);

    }

    public static void calculate() {
        int count = 0;
        int[] mix = {0,0,0};

        for(int i = 0 ; i < N ; i++){
            if(visited[i]){
                count++;

                for(int j = 0 ; j < 3; j++){
                    mix[j]+=paints[i][j];
                }
            }
        }
        

        for(int i = 0 ; i < 3; i++){
            mix[i]/=count;
        }

        int dif = Math.abs(mix[0]-gomColor[0])+Math.abs(mix[1]-gomColor[1])+Math.abs(mix[2]-gomColor[2]);
        moonColor = Math.min(moonColor,dif);

    }




    public static void main(String[] args) throws Exception {
        input();
        process();
        System.out.println(moonColor);
    }
}
