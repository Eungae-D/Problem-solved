import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    private static StringBuilder sb;
    private static BufferedReader br;
    private static StringTokenizer st;
    private static int N;
    private static Stack<Integer> stack = new Stack<>();
    private static int sum = 0;

    //입력
    public static void input() throws Exception {
        br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();

        N = Integer.parseInt(br.readLine());

        for(int i = 0 ; i < N ; i++){
            int input = Integer.parseInt(br.readLine());

            stackProcess(input);
        }
        process();
    }

    //스택 쌓기 실행
    public static void stackProcess(int input) {
        if(input==0){
            stack.pop();
            return;
        }

        stack.push(input);
    }

    //출력
    public static void process(){
        while (!stack.isEmpty()){
            sum+=stack.pop();
        }

        System.out.println(sum);
    }


    public static void main(String[] args) throws Exception {
        input();
    }
}
