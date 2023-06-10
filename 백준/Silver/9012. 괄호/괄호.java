import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Character> stack = new Stack<>();

        int N = sc.nextInt();

        for (int i = 0; i < N; i++) {
            String input = sc.next();
            int size = input.length();
            boolean TorF = true;

            for (int j = 0; j < size; j++) {
                char word = input.charAt(j);

                if (word == '(') {
                    stack.push(word);
                } else if (stack.empty()) {
                    TorF = false;
                    break;
                } else {
                    stack.pop();
                }

            }

            if (TorF && stack.empty()) {
                System.out.println("YES");
            } else {
                System.out.println("NO");

            }
            stack.clear();


        }

    }
}