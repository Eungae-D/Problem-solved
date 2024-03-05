import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    private static StringBuilder sb;
    private static BufferedReader br;
    private static StringTokenizer st;
    private static Stack<Integer> stack;
    private static int N;


    public static void input() throws Exception {
        br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();

        stack = new Stack<>();

        N = Integer.parseInt(br.readLine());

    }

    public static void process() throws Exception{
        int s = 0;

        while(N>0){

            int input = Integer.parseInt(br.readLine());

            if(input>s){
                for(int i = s+1; i<=input; i++){
                    stack.push(i);
                    sb.append('+').append("\n");
                }
                s = input;
            }else if(stack.peek() != input){
                System.out.println("NO");
                return;
            }
            stack.pop();
            sb.append('-').append("\n");

            N--;
        }
        System.out.println(sb);
    }


    public static void main(String[] args) throws Exception {
        input();
        process();
    }
}
