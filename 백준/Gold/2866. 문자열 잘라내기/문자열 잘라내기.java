import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class Main {
    private static BufferedReader br;
    private static StringTokenizer st;
    private static StringBuilder sb;
    private static char[][] arr;
    private static int R,C;
    private static int answer;

    public static void input()throws Exception{
        br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());
        sb = new StringBuilder();
        R = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());
        arr = new char[R][C];

        for(int i = 0 ; i < R; i++){
            String line = br.readLine();
            for(int j = 0 ; j < C; j++ ){
                arr[i][j] = line.charAt(j);
            }
        }
    }
    public static void process(){
        answer = search(R,C);
        System.out.println(answer);
    }

    public static int search(int R, int C){
        int s = 0;
        int e = R-1;

        while(s<=e){
            int mid = (s+e)/2;
            if(check(mid,R,C)){
                s = mid+1;
            }else{
                e = mid-1;
            }
        }
        return s;
    }

    public static boolean check(int mid, int R ,int C){
        TreeSet<String> set = new TreeSet<>();
        for(int i = 0 ; i < C ; i++){
            sb.setLength(0);
            for(int j = mid+1; j<R ; j++){
                sb.append(arr[j][i]);
            }
            if(set.contains(sb.toString())){
                return false;
            }
            set.add(sb.toString());
        }
        return true;
    }

    public static void main(String[] args) throws Exception{
        input();
        process();
    }
}
