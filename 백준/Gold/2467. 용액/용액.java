import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0 ; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }

        int s = 0;
        int e = n-1;

        int sum = Integer.MAX_VALUE;

        int liquidA = 0;
        int liquidB = 0;


        while (s!=e){


            int tmp =arr[s]+arr[e];

            if(tmp==0){
                liquidA = arr[s];
                liquidB = arr[e];
                break;
            }

            if(Math.abs(tmp)<=sum){
                
                sum = Math.abs(tmp);

                liquidA = arr[s];
                liquidB = arr[e];
            }

            if(tmp<0){
                s++;
            }else{
                e--;
            }

        }
        System.out.println(liquidA+" "+liquidB);

    }
}
