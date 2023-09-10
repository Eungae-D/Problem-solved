import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for(int tc = 1 ; tc<=T ; tc++){

			int []arr = new int [20];
			int count = 0;
			int testCase = sc.nextInt();

			for(int i = 0 ; i < 20; i ++){
				arr[i] = sc.nextInt();
			}


			for(int i = 0 ; i < 20; i ++){
				for(int j= 0 ; j < i ; j++){
					if(arr[i]<arr[j]){
					count++;
					}
				}
			}
			System.out.println(testCase+" "+count);
		}

	}
}
