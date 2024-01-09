import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean[] flag = new boolean[1000001];
        ArrayList<Integer> arr = new ArrayList<>();


        for (int i = 2; i < 1000001; i++)
            flag[i] = true;


        for (int i = 2; i*i < 1000001; i++) {
            if (flag[i]) {
                for (int j = i * i; j < 1000001; j += i)
                    flag[j] = false;
            }
        }


        for (int i = 2; i < 1000001; i++) {
            if (flag[i])
                arr.add(i);
        }


        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            long m = sc.nextLong();
            boolean isPrime = true;

            for (int j = 0 ; j <arr.size(); j++) {
                if (m % arr.get(j) == 0) {
                    System.out.println("NO");
                    isPrime = false;
                    break;
                }
            }

            if (isPrime)
                System.out.println("YES");
        }

        sc.close();
    }
}