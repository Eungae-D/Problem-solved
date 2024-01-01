import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] house = new int[n];

        if(n==1){
            System.out.println(sc.nextInt());
        }
        else{
            for(int i = 0 ; i < n; i++) {
                house[i] = sc.nextInt();
            }
            Arrays.sort(house);
            
            System.out.println(house[(n-1)/2]);
        }
    }
}
