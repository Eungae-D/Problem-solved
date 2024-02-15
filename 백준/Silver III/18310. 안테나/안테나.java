import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] house = new int[n];

        for(int i = 0 ; i < n; i++) {
            house[i] = sc.nextInt();
        }

        Arrays.sort(house);

        if(n%2==0){
            System.out.println(house[(n-1)/2]);
        }else{
            System.out.println(house[n/2]);
        }

    }
}
