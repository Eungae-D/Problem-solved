import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    private static StringBuilder sb;
    private static BufferedReader br;
    private static Stack<Character> stack;

    //입력
    public static void input() throws Exception {
        br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();

        while (true) {
            String line = br.readLine();

            if(line.charAt(0) == '.') break;

            sb.append(process(line)).append("\n");
        }
    }

    //실행
    public static String process(String line) {
        stack = new Stack<>();

        for(int i = 0 ; i < line.length(); i++){
          char c = line.charAt(i);

          if(c == '(' || c == '['){
              stack.push(c);
          }else if(c ==')'){
              if(stack.isEmpty() || stack.peek() !='('){
                  return "no";
              }else{
                  stack.pop();
              }
          }else if(c==']'){
              if(stack.isEmpty() || stack.peek() !='['){
                  return "no";
              }else{
                  stack.pop();
              }
          }
        }

        if(stack.isEmpty()) return "yes";

        return "no";
    }


    public static void main(String[] args) throws Exception {
        input();
        System.out.println(sb);
    }
}
