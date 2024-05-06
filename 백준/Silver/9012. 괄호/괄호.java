import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    private static StringBuilder sb;
    private static BufferedReader br;
    private static StringTokenizer st;
    private static int N;
    private static Stack<Character> stack;

    //입력
    public static void input() throws Exception {
        br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();

        N = Integer.parseInt(br.readLine());

        for(int i = 0 ; i < N ; i++){
            stack = new Stack<>();

            String line = br.readLine();

            sb.append(process(line)).append("\n");
        }
    }

    //실행
    public static String process(String line) {
        for(int i = 0 ; i < line.length() ; i++){
            char c = line.charAt(i);

            if(c == '('){
                stack.push('(');
            }else if(c == ')'){
                if(stack.isEmpty() || stack.peek() != '('){
                    return "NO";
                }

                stack.pop();
            }
        }

        if(stack.isEmpty()) return "YES";
        return "NO";
    }


    public static void main(String[] args) throws Exception {
        input();
        System.out.println(sb.toString());
    }
}
