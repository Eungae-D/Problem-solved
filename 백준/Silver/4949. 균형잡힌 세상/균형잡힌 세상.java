import java.util.Stack;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            String line = sc.nextLine();

            if (line.equals(".")) {
                break;
            }
            System.out.println(probelm(line));

        }
    }

    private static String probelm(String line) {
        Stack<Character> stack = new Stack<>();

        int size = line.length();
        for (int i = 0; i < size; i++) {
            char c = line.charAt(i);

            if (c == '(' || c == '[') {
                stack.push(c);
            } else if (c == ')') {
                if (stack.isEmpty() || stack.peek() != '(') {
                    return "no";
                } else {
                    stack.pop();
                }
            } else if (c == ']') {
                if (stack.isEmpty() || stack.peek() != '[') {
                    return "no";
                } else {
                    stack.pop();
                }
            }

        }
        if (stack.isEmpty()) {
            return "yes";
        } else {
            return "no";
        }


    }
}