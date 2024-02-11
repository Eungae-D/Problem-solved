import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();

        int numericResult = A + B - C;
        System.out.println(numericResult);

        String stringResult = Integer.toString(A) + Integer.toString(B);
        int finalResult = Integer.parseInt(stringResult) - C;
        System.out.println(finalResult);
    }
}
