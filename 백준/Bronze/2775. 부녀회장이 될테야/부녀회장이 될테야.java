
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 응애 나는 부녀회장이 될테야
		int T = sc.nextInt();
		// 0층에 0~14명 살고
		for (int tc = 0; tc < T; tc++) {
			int[] arr = new int[15];
			for (int i = 0; i < arr.length; i++) {
				arr[i] = i;
			}
			int[] cnt = new int[15];
			// 이거 그냥 그 카운트 배열 만들고
			// 누적합 그거 같은데.....
			// 그뭐냐... 기억이안나내

			// 이게 반복문 수 층
			// 이걸 왜못푸냐 진짜;;;;;;;;;;;;;;;;;;;;;
			int k = sc.nextInt();
			// 이게 호수
			int n = sc.nextInt();

			for (int i = 0; i < k; i++) {
				for (int j = 1; j < arr.length; j++) {
					cnt[j] = cnt[j - 1] + arr[j];
					arr[j] = cnt[j];
				}
				for (int l = 0; l < arr.length; l++) {
					cnt[l] = 0;
				}

			}
			
			
			System.out.println(arr[n]);

		}

	}
}
