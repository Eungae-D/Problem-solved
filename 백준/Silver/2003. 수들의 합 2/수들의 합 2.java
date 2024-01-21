import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] arr = new int[n+1];

        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        int s = 0;
        int e = 0;

        int total = arr[0];
        int cnt = 0;

        while (e<n){
            if(total <m){
                e+=1;
                total += arr[e];
            }else if(total > m){
                total -=arr[s];
                s += 1;
            }else{
                cnt +=1;
                total -= arr[s];
                s +=1;
                e+=1;
                total += arr[e];
            }
        }

        System.out.println(cnt);

    }
}
