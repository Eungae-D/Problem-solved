import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int input = sc.nextInt();
		int alcohol = sc.nextInt();

		if(12<=input&&input<=16&&alcohol!=1){
			System.out.println(320);
		}else{
			System.out.println(280);
		}
	}
}
