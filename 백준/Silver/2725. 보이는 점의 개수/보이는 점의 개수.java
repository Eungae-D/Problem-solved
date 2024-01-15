import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int c = sc.nextInt();

        int []arr = new int[1001];
        arr[1] = 3;

        for(int i = 2; i <=1000; i++){
            int cnt = 0;
            for(int j = 1; j<i; j++){
                if(gcd(i,j)==1){
                    cnt+=2;
                }
                arr[i] = arr[i-1]+cnt;
            }
        }

        for(int i = 0; i < c; i++){
            System.out.println(arr[sc.nextInt()]);
        }
    }
    
    public static int gcd(int i, int j) {
        while (i%j!=0){
            int temp = i%j;
            i = j;
            j = temp;
        }
        return j;
    }
}
