
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    private static BufferedReader br;
    private static StringTokenizer st;
    private static StringBuilder sb;
    private static int N,M;
    private static boolean[] guitar;
    private static int[][] arr;
    private static int songs = -1;
    private static int answer = Integer.MAX_VALUE;

    public static void input() throws Exception{
        br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());
        sb = new StringBuilder();

        N= Integer.parseInt(st.nextToken());
        M= Integer.parseInt(st.nextToken());

        guitar = new boolean[N];
        arr = new int[N][M];


        for(int i = 0; i < N; i++){
            st = new StringTokenizer(br.readLine());
            st.nextToken();

            String songInfo = st.nextToken();
            for(int j = 0 ; j < M ; j++){
                if(songInfo.charAt(j) == 'Y'){
                    arr[i][j] = 1;
                }else{
                    arr[i][j] = 0;
                }
            }
        }

//        System.out.println(Arrays.deepToString(arr));
    }

    public static void process() {
        recur(0,0);
        if(answer==0){
            System.out.println(-1);
        }else{
            System.out.println(answer);
        }
    }

    public static int countSongs(){
        boolean[] visited = new boolean[M];
        int count = 0;
        for(int i = 0 ; i < N; i++){
            if(guitar[i]){
                for(int j = 0 ; j < M ; j++){
                    if(arr[i][j] == 1 && !visited[j]){
                        visited[j] = true;
                        count++;
                    }
                }
            }
        }
        return count;
    }

    public static void recur(int cur, int count){
        if(cur == N){
            //여기서 비교
            int songCnt = countSongs();
            if(songCnt > songs){
                songs = songCnt;
                answer = count;
            }else if(songCnt == songs && count<answer){
                answer = count;
            }
            return;
        }

        //기타 선택 o
        guitar[cur] = true;
        recur(cur+1,count+1);
        //기타 선택 x
        guitar[cur] = false;
        recur(cur+1,count);

    }

    public static void main(String[] args) throws Exception{
        input();
        process();
    }
}
