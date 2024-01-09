import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr= new int[n];
        Set<Integer> set = new HashSet<>();

        for(int i = 0; i < n ; i++){
            arr[i] = sc.nextInt();
            set.add(arr[i]);
        }

        int max = 0;

        for(int i : set){
            int count = 0;
            int temp = -1;
            for(int j = 0 ; j < n ; j++){
                if(arr[j]==i){
                    continue;
                }
                if(arr[j]!=temp){
                    max = Math.max(max, count);
                    temp = arr[j];
                    count = 1;
                }
                else{
                    count++;
                }
            }
            max = Math.max(max, count);
        }
        System.out.println(max);
    }
}
