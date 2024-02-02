
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int size = sc.nextInt();

		int[][] time = new int[size][2];

		for (int i = 0; i < size; i++) {
			time[i][0] = sc.nextInt();
			time[i][1] = sc.nextInt();
		}

		// 종료시간 기준으로 오름차순 정렬 한뒤 종료시간 같으면 시작시간 기준 오름차순정렬
		Arrays.sort(time, new Comparator<int[]>() {
			@Override
			public int compare(int[] o1, int[] o2) {
				if (o1[1] == o2[1]) {
					return o1[0] - o2[0];
				}
				return o1[1] - o2[1];
			}

		});

		int cnt = 0;
		int endtime = 0;

		for (int i = 0; i < size; i++) {
			if (endtime <= time[i][0]) {
				endtime = time[i][1];
				cnt++;
			}
		}
		System.out.println(cnt);

	}
}
