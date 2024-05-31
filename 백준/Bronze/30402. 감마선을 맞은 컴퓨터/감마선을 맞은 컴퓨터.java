import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String[][] a = new String[15][15];
		
		for(int i = 0; i < 15; i++) {
			for(int j = 0; j < 15; j++) {
				a[i][j] = sc.next();
			}
		}
		
		int j;
		for(int i = 0; i < 15; i++) {
			for(j = 0; j < 15; j++) {
				if(a[i][j].equals("w")) {
					System.out.println("chunbae");
					break;
				}else if(a[i][j].equals("b")) {
					System.out.println("nabi");
					break;
				}else if(a[i][j].equals("g")) {
					System.out.println("yeongcheol");
					break;
				}
			}
			if(j != 15) {
				break;
			}
		}
		sc.close();
	}
}