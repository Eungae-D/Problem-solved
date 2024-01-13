import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();

        int ans = 1;
        for(int i = 2; i*i<=n; i++){
            ans++;
        }
        System.out.println(ans);
    }

}
