import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Score a = new Score();
		Score b = new Score();
		
		a.t = sc.nextInt();
		a.f = sc.nextInt();
		a.s = sc.nextInt();
		a.p = sc.nextInt();
		a.c = sc.nextInt();
		
		b.t = sc.nextInt();
		b.f = sc.nextInt();
		b.s = sc.nextInt();
		b.p = sc.nextInt();
		b.c = sc.nextInt();
		
		a.total = a.t * 6 + a.f * 3 + a.s * 2 + a.p + a.c * 2;
		b.total = b.t * 6 + b.f * 3 + b.s * 2 + b.p + b.c * 2;
		
		System.out.println(a.total + " " + b.total);
		sc.close();
	}
}
class Score {
	int t, f, s, p, c, total;
}