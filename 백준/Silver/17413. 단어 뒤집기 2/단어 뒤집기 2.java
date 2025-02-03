import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    private static BufferedReader br;
    private static StringBuilder sb;
    private static String line;
    private static Stack<Character> stack = new Stack<>();

    public static void input() throws Exception {
        br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();
        line = br.readLine();
    }

    public static void process(){
        for(int i = 0 ; i < line.length() ; i++){
            if(line.charAt(i)=='<'){
                while(!stack.isEmpty()){
                    sb.append(stack.pop());
                }
                while(line.charAt(i) != '>'){
                    sb.append(line.charAt(i++));
                }
                sb.append('>');
            }else if(line.charAt(i)==' '){
                while (!stack.isEmpty()) {
                    sb.append(stack.pop());
                }
                sb.append(' ');
            }else{
                stack.push(line.charAt(i));
            }
        }

        while (!stack.isEmpty()) sb.append(stack.pop());
        System.out.println(sb.toString());
    }

    public static void main(String[] args) throws Exception{
        input();
        process();
    }
}
