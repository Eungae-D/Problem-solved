import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();

        int team = 0;
        while(n >= 2 && m >= 1 && n+m-k >= 3){
            team++;
            n = n-2;
            m = m-1;
        }
        System.out.println(team);
    }
}
