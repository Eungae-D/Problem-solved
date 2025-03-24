import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    private static BufferedReader br;
    private static StringBuilder sb;
    private static StringTokenizer st;
    private static int N;
    private static ArrayList<Integer> list;
    private static int max;

    public static void input() throws Exception {
        br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());
        sb = new StringBuilder();

        N = Integer.parseInt(st.nextToken());

        for(int i = 0 ; i < N; i++){
            String[] arr = br.readLine().split(" ");

            list = new ArrayList<>();

            for(int j = 0 ; j < arr.length ;  j++){
                list.add(Integer.valueOf(arr[j]));
            }

            process();
        }
    }
    public static void gcd(int a, int b){
        int temp = 0;

        while(a%b!=0){
            temp = a%b;
            a = b;
            b = temp;
        }

        if(max < b){
            max = b;
        }
    }

    public static void process(){
        max = Integer.MIN_VALUE;

        for(int i = 0 ; i < list.size()-1; i++){
            for(int j = i+1 ; j < list.size(); j++){
                gcd(list.get(i),list.get(j));
            }
        }

        sb.append(max).append("\n");
    }

    public static void main(String[] args) throws Exception{
        input();
        System.out.println(sb);
    }
}
