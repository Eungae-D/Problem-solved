import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int l = sc.nextInt();
		int r = sc.nextInt();
		int min = l;
		int a;
		
		if(x > r) {
			min = r;
		}else if(x < l) {
			min = l;
		}else {
			min = x;
		}
		
		System.out.println(min);
		sc.close();
	}
}