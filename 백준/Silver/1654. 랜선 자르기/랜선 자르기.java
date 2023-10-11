import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //랜선갯수
        int K = sc.nextInt();
        //필요한랜선갯수
        int N = sc.nextInt();

        int []arr= new int[K];

        //long형 이유 : min+max가 최댓값을 넘길수 있어서
        long max = 0;

        //max 값 갱신
        for(int i = 0 ; i < K; i++){
            arr[i] = sc.nextInt();
            if(max<arr[i]){
                max = arr[i];
            }
        }
        //주어진 수가 1밖에 없으면 mid 값이 0이 나올 수 있으므로
        max++;

        long min = 0;
        long mid = 0;

        while(min < max){
            mid = (max+min)/2;

            long count = 0;

            for(int i = 0 ; i < arr.length; i++){
                count +=(arr[i]/mid);
            }

            if(count < N){
                max = mid;
            }
            else{
                min = mid+1;
            }

        }
        System.out.println(min-1);

    }
}
