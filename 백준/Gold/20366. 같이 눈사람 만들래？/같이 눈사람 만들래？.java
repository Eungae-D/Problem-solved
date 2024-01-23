
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        long[] arr = new long[n];

        for(int i = 0 ; i < n ; i ++){
            arr[i] = sc.nextLong();
        }
        Arrays.sort(arr);

        long answer = Integer.MAX_VALUE;

        for(int i = 0 ; i < n; i++){
            for(int j = 0 ; j < n; j++){
                if(i==j) continue;

                long snow = arr[i]+arr[j];

                int s = 0;
                int e = n-1;

                while (s<e){
                    if(s==i||s==j){
                        s++;
                        continue;
                    }

                    if(e==i||e==j){
                        e--;
                        continue;
                    }

                    answer = Math.min(answer,Math.abs(arr[i]+arr[j]-(arr[s]+arr[e])));

                    if(arr[s]+arr[e]>arr[i]+arr[j]){
                        e-=1;
                    }else{
                        s++;
                    }
                }

            }
        }

        System.out.println(answer);

    }
}
