import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        Stack<Integer> stack = new Stack<>();

        int size = sc.nextInt();

        int start = 0;

        while (size-- > 0) {
            int input = sc.nextInt();

            if (input > start) {
                for (int i = start + 1; i <= input; i++) {
                    stack.push(i);
                    sb.append('+').append('\n');
                }
                start = input;

            } else if (stack.peek()!=input) {
                System.out.println("NO");
                return;
            }
            stack.pop();
            sb.append('-').append('\n');

        }
        System.out.println(sb);


    }
}