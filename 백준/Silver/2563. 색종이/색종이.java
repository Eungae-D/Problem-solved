import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int tc = sc.nextInt();
		int[][] arr = new int[100][100];
		int sum = 0;
		
		int count = 0;
		for (int i = 0; i < tc; i++) {

			int n = sc.nextInt();
			int m = sc.nextInt();
			
			for (int j = n; j < 10 + n; j++) {
				for (int k = m; k < 10 + m; k++) {
					arr[j][k] = 1;
				}
			}
		}

			for (int a = 0; a < 100; a++) {
				for (int b = 0; b < 100; b++) {

					if (arr[a][b] == 1) {
						count++;
					}
				}
			}

			System.out.println(count);
		}
	}
	

