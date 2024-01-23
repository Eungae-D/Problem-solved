import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int []arr = new int[n];

        for(int i = 0 ; i < n; i++){
            arr[i] = sc.nextInt();
        }

        int s = 0;
        int e = n-1;

        int min = Integer.MIN_VALUE;

        while(s<e){
            int person = e-s-1;
            int answer = person*Math.min(arr[s],arr[e]);
            min=Math.max(min,answer);

            if(arr[s]<arr[e]){
                s++;
            }else{
                e--;
            }
        }
        System.out.println(min);



    }
}
