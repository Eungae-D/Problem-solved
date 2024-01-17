import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        long sum = 0;

        for(int i = 2; i < n; i ++){
            sum+=(n/i-1)*i;
        }
        System.out.println(sum%1000000);

    }
}
