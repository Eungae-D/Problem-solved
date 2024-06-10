import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class Main {
    private static BufferedReader br;
    private static StringTokenizer st;
    private static StringBuilder sb;
    private static String S;
    private static int[] arr,cnt;
    private static TreeMap<Integer, Integer> map = new TreeMap<>();
    private static int answer = -1;


    public static void input() throws Exception{
        br = new BufferedReader(new InputStreamReader(System.in));
        S = br.readLine();

        arr = new int[S.length()+1];
        cnt = new int[S.length()+1];

        for(int i = 0 ; i < S.length() ; i++){
            int n = 0;
            if(S.charAt(i)=='S') n = 2;
            if(S.charAt(i)=='K') n = -1;

            arr[i+1] = arr[i]+n;
            cnt[i+1] = cnt[i]+ (n==0 ? 0 : 1);
        }
    }
    public static void process(){
        for(int i = 0 ; i <= S.length(); i++){
            if(!map.containsKey(arr[i])){
                map.put(arr[i],i);
            }else{
                int compIdx = map.get(arr[i]);
                if(cnt[compIdx] == cnt[i]) continue;
                answer = Math.max(answer, i-compIdx);
            }
        }
        System.out.println(answer);
    }

    public static void main(String[] args) throws Exception{
        input();
        process();
    }
}
