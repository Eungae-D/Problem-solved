import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] x = new int[n];
        int[] y = new int[n];

        for(int i = 0 ; i < n ; i++){
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
        }

        Arrays.sort(x);
        Arrays.sort(y);


        int midX;
        int midY;

        long sumX = 0;
        long sumY = 0;


        midX= x[n/2];
        midY= y[n/2];


        for(int i = 0 ; i < n ; i++){
            sumX+=Math.abs(midX-x[i]);
            sumY+=Math.abs(midY-y[i]);
        }
        System.out.println(sumX+sumY);
    }
}
