import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int []arr = new int[n];

        for(int i = 0 ; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }

        int x = sc.nextInt();

        Arrays.sort(arr);

        int s = 0;
        int e = n-1;


        int cnt = 0;

        while (s<e){
            if(arr[s]+arr[e]==x){
                cnt++;
                s +=1;
                e -=1;
            } else if (arr[s]+arr[e]<x) {
                s +=1;
            }else{
                e -=1;
            }
        }
        System.out.println(cnt);

    }

}
