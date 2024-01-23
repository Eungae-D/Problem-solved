import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int d = sc.nextInt();
        int k = sc.nextInt();
        int c = sc.nextInt();

        int[]arr = new int[n+k-1];
        int[]count = new int[d+1];

        for(int i = 0 ; i<n; i++){
            arr[i] = sc.nextInt();
        }

        for(int i = 0; i <k-1; i++){
            arr[n++] = arr[i];
        }

        int cnt = 0 ;
        int result = 0;

        for(int i = 0 ; i < n; i++){

            if(++count[arr[i]]==1){
                cnt++;
            }

            if(i>=k-1){
                if(i>=k){
                    if(--count[arr[i-k]]==0){
                        cnt--;
                    }
                }
                if(count[c]==0){
                    result = Math.max(cnt+1,result);
                }else{
                    result = Math.max(cnt,result);
                }
            }

        }
        System.out.println(result);
    }
}
