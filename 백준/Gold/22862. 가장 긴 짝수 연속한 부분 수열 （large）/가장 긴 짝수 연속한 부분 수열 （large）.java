import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0 ; i < arr.length; i++){
            arr[i] = sc.nextInt()%2;
        }

        int s = 0;
        int e = 0;

        int count = 0;
        int max = Integer.MIN_VALUE;
        while (e<n){
            if(count<k){
                if(arr[e]==1){
                    count++;
                }
                e++;
                max = Math.max(max,e-s-count);
            }else if(arr[e]==0){
                e++;
                max = Math.max(max, e-s-count);
            }else{
                if(arr[s]==1){
                    count--;
                }
                s++;
            }

        }
        System.out.println(max);

    }
}
