import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int s = sc.nextInt();

        int[] arr = new int[n+1];

        for(int i = 0 ; i < n; i ++){
            arr[i] = sc.nextInt();
        }

        int start = 0;
        int end = 0;

        int answer = Integer.MAX_VALUE;
        int sum = 0;

        while(start<=n && end <=n){

            if(sum<s){
                sum+=arr[end];
                end++;
            }else{
                sum-=arr[start];
                start++;
            }

            if(sum>=s){
                answer = Math.min(answer,end-start);
            }

        }
        if(answer==Integer.MAX_VALUE){
            System.out.println(0);
        }else{
            System.out.println(answer);
        }
    }
}
