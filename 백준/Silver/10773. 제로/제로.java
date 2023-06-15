
import java.util.Stack;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();

        Stack<Integer> stack = new Stack<>();

        int sum = 0;

        for(int i = 0 ; i < K; i++){
            int input = sc.nextInt();

            if(input!=0){
                stack.push(input);
            }
            else {
                if(stack.isEmpty()){
                    System.out.println(0);
                    return;
                }
                stack.pop();
            }
        }

        while (!stack.isEmpty()){
            sum+=stack.pop();
        }
        System.out.println(sum);
    }
}
