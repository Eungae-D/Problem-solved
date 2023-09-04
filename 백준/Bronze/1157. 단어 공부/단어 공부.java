import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] arr = new int[26];
		String input = sc.next();

		for (int i = 0; i < input.length(); i++) {
			// 대문자범위
			if (65 <= input.charAt(i) && input.charAt(i) <= 90) {
				arr[input.charAt(i) - 65]++;

			} else {
				arr[input.charAt(i) - 97]++;
			}
		}
		int max = -1;
		char ch = '?';

		for (int j = 0; j < 26; j++) {
			if (arr[j] > max) {
				max = arr[j];
				ch = (char) (j + 65);
			} else if (arr[j] == max) {
				ch = '?';
			}
		}
		System.out.println(ch);
	}
}