import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int size = sc.nextInt();

		int[] stairs = new int[301];
		int[] dp = new int[301];

		for (int i = 1; i <= size; i++) {
			stairs[i] = sc.nextInt();
		}

		dp[0] = 0;
		dp[1] = stairs[1];
		dp[2] = stairs[1] + stairs[2];
		dp[3] = Math.max(stairs[1], stairs[2]) + stairs[3];

		int count = 0;
		for (int i = 4; i <= size; i++) {	
			dp[i] = Math.max(dp[i-3]+stairs[i-1], dp[i-2])+stairs[i];
		}
		System.out.println(dp[size]);

	}
}
