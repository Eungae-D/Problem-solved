
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int rock = sc.nextInt();

		System.out.println(rock % 2 == 0 ? "CY" : "SK");

	}
}
