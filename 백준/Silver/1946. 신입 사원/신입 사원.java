import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {
    private static BufferedReader br;
    private static StringBuilder sb;
    private static StringTokenizer st;
    private static int T,N;
    private static int[][] grade;
    private static int answer;


    public static void input() throws Exception{
        br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();

        T = Integer.parseInt(br.readLine());

        for(int i = 0 ; i < T ; i++){
            N = Integer.parseInt(br.readLine());

            grade = new int[N][2];

            for(int j = 0 ; j < N ; j++){
                st = new StringTokenizer(br.readLine());
                grade[j][0] = Integer.parseInt(st.nextToken());
                grade[j][1] = Integer.parseInt(st.nextToken());
            }

            Arrays.sort(grade, new Comparator<int[]>() {
                @Override
                public int compare(int[] o1, int[] o2){
                    return o1[0] - o2[0];
                }
            });

            process();
            answer = 0;
        }
    }

    public static void process(){
        int best = grade[0][1];
        answer++;
        for(int i = 1 ; i < N ; i++){
            if(best>grade[i][1]){
                answer++;
                best = grade[i][1];
            }
        }

        System.out.println(answer);
    }

    public static void main(String[] args) throws Exception{
        input();
    }
}

