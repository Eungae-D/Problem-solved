import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    private static StringBuilder sb;
    private static BufferedReader br;
    private static StringTokenizer st;
    private static int T;
    private static ArrayList<Integer> list;
    private static int max;

    //입력
    public static void input() throws Exception {
        br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();

        T = Integer.parseInt(br.readLine());

        for(int tc = 0 ; tc < T ; tc++){
            String[] arr = br.readLine().split(" ");

            list = new ArrayList<Integer>();

            for(int i = 0 ; i < arr.length ; i++){
                list.add(Integer.parseInt(arr[i]));
            }

            process();
        }
    }
    public static void gcd(int a, int b){
        while (a%b != 0){
            int temp = a%b;
            a = b;
            b = temp;
        }

        if(max<b){
            max = b;
        }
    }

    //실행
    public static void process() {
        max = Integer.MIN_VALUE;

        for(int i = 0 ; i < list.size()-1; i++){
            for(int j = i+1 ; j < list.size(); j++){
                gcd(list.get(i),list.get(j));
            }
        }

        sb.append(max).append("\n");
    }


    public static void main(String[] args) throws Exception {
        input();
        System.out.println(sb.toString());
    }
}
