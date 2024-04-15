import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    private static StringBuilder sb;
    private static BufferedReader br;
    private static StringTokenizer st;
    private static ArrayList<Integer> list = new ArrayList<Integer>();
    private static int N;
    private static boolean[] check = new boolean[10];

    //입력
    public static void input() throws Exception {
        br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();

        while(true){
            N = Integer.parseInt(br.readLine());
            if(N == 0) break;
            System.out.println(list.get(N-1));
        }

    }
    //중복 체크
    public static boolean duplicate(int number){
//        boolean[] check = new boolean[10];
        Arrays.fill(check,false);

        while(number > 0){
            int num = number % 10;

            if(check[num]){
                return true;
            }

            check[num] = true;
            number /= 10;
        }
        return false;
    }

    //실행
    public static void process() {
        int number = 1;
        while(list.size() < 1000000){
            if(!duplicate(number)){
                list.add(number);
            }
            number++;
        }
    }


    //먼저 중복된 숫자 검사해서 list에 저장
    public static void main(String[] args) throws Exception {
        process();
        input();
    }
}
