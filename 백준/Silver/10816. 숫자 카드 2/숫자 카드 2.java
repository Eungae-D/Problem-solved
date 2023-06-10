import java.util.Arrays;
import java.util.Scanner;

public class Main {
    //이분탐색으로 구현
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int N = sc.nextInt();

        int[]arr =new int[N];
        for(int i = 0 ; i < N; i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
//        System.out.println(Arrays.toString(arr));
        int M = sc.nextInt();

        for(int i = 0 ; i <M ; i++){
            int key = sc.nextInt();

            sb.append(upperIndex(arr,key)-lowerIndex(arr,key)).append(' ');

        }
        System.out.println(sb);


    }

    private static int lowerIndex(int[] arr, int key) {
        int high = arr.length;
        int low = 0;
        while (low<high){
            int mid = (high + low)/2;

            if(key <=arr[mid]){
                high = mid;
            }
            else {
                low=mid+1;
            }


        }


        return low;
    }

    private static int upperIndex(int[] arr, int key) {
        int high = arr.length;
        int low = 0;

        while (low < high){
            int mid = (high+low)/2;

            if(key<arr[mid]){
                high=mid;
            }
            else{
                low = mid+1;
            }
        }



        return low;
    }
}