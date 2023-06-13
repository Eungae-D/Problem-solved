import java.util.Arrays;
import java.util.Scanner;

public class Main {
    //이분탐색으로 풀어내자
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int size = sc.nextInt();
        int []arr = new int[size];

        for(int i = 0 ; i < size; i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);

        int M = sc.nextInt();

        for(int i = 0 ; i<M; i++){
            if(Search(arr,sc.nextInt())>=0){
                sb.append(1).append('\n');
            }
            else sb.append(0).append('\n');
        }
        System.out.println(sb);




    }

    private static int Search(int[] arr, int key) {
        int leftIndex = 0;
        int rightIndex = arr.length-1;

        while(leftIndex<=rightIndex){
            int mid = (leftIndex+rightIndex)/2;

            if(key<arr[mid]){
                rightIndex = mid-1;
            } else if (key>arr[mid]) {
                leftIndex = mid+1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
}
