import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int round = sc.nextInt();
		StringBuilder sb = new StringBuilder();
		int []arr = new int[21];

		for(int tc = 0 ; tc < round; tc++){
			String input = sc.next();

			switch (input){
				case "add":
					int addNumber = sc.nextInt();
					if(arr[addNumber]!=0){
						continue;
					}
					arr[addNumber]++;
					break;
				case "check":
					int checkNumber = sc.nextInt();
					if(arr[checkNumber]!=0){
						sb.append(1).append("\n");
					}
					else {
						sb.append(0).append("\n");
					}
					break;
				case "remove":
					int removeNumber = sc.nextInt();
					if(arr[removeNumber]!=0){
						arr[removeNumber]=0;
					}
					break;
				case "all":
					for(int i = 1 ; i <=20; i++){
						arr[i] = 1;
					}
					break;
				case "toggle":
					int toggleNumber = sc.nextInt();
					if(arr[toggleNumber]!=0){
						arr[toggleNumber]=0;
					}else {
						arr[toggleNumber]=1;
					}
					break;
				case "empty":
					for(int i = 1;  i <= 20 ; i++){
						arr[i]=0;
					}
					break;
			}

		}
		System.out.println(sb);

	}
}
