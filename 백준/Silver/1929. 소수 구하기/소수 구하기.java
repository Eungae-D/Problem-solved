import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int M = sc.nextInt();
        int N = sc.nextInt();

        primeNumber(M, N);
    }

    private static void primeNumber(int M, int N) {
        int[] arr = new int[N + 1];
        StringBuilder sb = new StringBuilder();


        for (int i = 2; i <= N; i++) {
            arr[i] = i;
        }

        for (int i = 2; i <= N; i++) {
            if (arr[i] == 0) {
                continue;
            }
            for (int j = i + i; j <= N; j = j + i) {
                arr[j] = 0;
            }
        }
        for (int i = M ; i<=N ; i++){
            if(arr[i]!=0){
                sb.append(i).append('\n');
            }
        }
        System.out.println(sb);


    }
}