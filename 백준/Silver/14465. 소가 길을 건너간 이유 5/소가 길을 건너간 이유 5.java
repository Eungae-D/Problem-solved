import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();
        int b = sc.nextInt();


        //정상 false 고장 true
        boolean[] arr = new boolean[n+1];

        int count = 0 ;

        for(int i = 1 ; i <=b; i++){
            int index = sc.nextInt();
            arr[index] = true;
        }

        //초기 k만큼 고장 갯수
        for(int i = 1 ; i <k+1; i++){
            if(arr[i]){
                count++;
            }
        }

        int s = 1;
        int e = k;

        int min = Integer.MAX_VALUE;

        while(e<n){
            if(arr[s]&& !arr[e+1]){
                count--;
            }else if(!arr[s]&& arr[e+1] ){
                count++;
            }
            min = Math.min(min, count);

            s++;
            e++;
        }

        System.out.println(min);




    }
}
