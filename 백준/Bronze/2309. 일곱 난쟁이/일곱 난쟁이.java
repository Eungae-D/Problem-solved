import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[9];

        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            sum += arr[i];
        }

        Arrays.sort(arr);


        int s = 0;
        int e = 8;

        while (s<e) {
            int tmp = sum - arr[s]-arr[e];
            if(tmp ==100){
                for(int i = 0; i < 9; i++){
                    if(i==s||i==e){
                        continue;
                    }
                    System.out.println(arr[i]);
                }
                break;
            }
            else if(tmp>100){
                s++;
            }else{
                e--;
            }
        }

    }
}

