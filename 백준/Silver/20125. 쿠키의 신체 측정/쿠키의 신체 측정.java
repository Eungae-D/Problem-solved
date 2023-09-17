import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());

		char[][] board = new char[N][N];
		for (int i = 0; i < N; i++) {
			board[i] = br.readLine().toCharArray();
		}

		int heartX = 0;
		int heartY = 0;
		outer: for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if (board[i][j] == '*') {
					heartX = i + 1;
					heartY = j;
					break outer;
				}
			}
		}

		int leftArm = 0, rightArm = 0, waist = 0, leftLeg = 0, rightLeg = 0;
		for (int y = heartY - 1; y >= 0 && board[heartX][y] == '*'; y--){
			leftArm++;
		}
		for (int y = heartY + 1; y < N && board[heartX][y] == '*'; y++){
			rightArm++;
		}
		for (int x = heartX + 1; x < N && board[x][heartY] == '*'; x++){
			waist++;
		}
		for (int x = heartX + waist + 1; x < N && board[x][heartY - 1] == '*'; x++){
			leftLeg++;
		}
		for (int x = heartX + waist + 1; x < N && board[x][heartY + 1] == '*'; x++){
			rightLeg++;
		}

		System.out.println((heartX + 1) + " " + (heartY + 1));
		System.out.println(leftArm + " " + rightArm + " " + waist + " " + leftLeg + " " + rightLeg);
	}
}
