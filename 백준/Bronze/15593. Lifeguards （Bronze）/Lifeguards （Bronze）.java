import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[]time = new int[1001];
        int[][]arr = new int[n][2];
        int totalTime = 0;



        for(int i = 0 ; i < n; i++){
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
            for(int j = arr[i][0]; j < arr[i][1]; j++){
                if(time[j]==0){
                    totalTime++;
                }
                time[j]++;
            }
        }

        int min = Integer.MAX_VALUE;

        for(int i = 0 ; i < n; i++){
            int count = 0;
            for(int j = arr[i][0]; j < arr[i][1]; j++){
                if(time[j]<=1){
                    count++;
                }
            }
            min = Math.min(min,count);
        }

        System.out.println(totalTime-min);
    }
}
