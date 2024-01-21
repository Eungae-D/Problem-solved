import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int n = sc.nextInt();
        int m = sc.nextInt();



        int[] arrA = new int[n];
        int[] arrB = new int[m];

        for(int i = 0 ; i < n; i++){
            arrA[i] = sc.nextInt();
        }
        for(int i = 0 ; i < m; i++){
            arrB[i] = sc.nextInt();
        }


        int s = 0 ;
        int e = 0 ;

        while ( s<n && e<m){
            if(arrA[s]<=arrB[e]){
                sb.append(arrA[s]+" ");
                s +=1;
            } else {
                sb.append(arrB[e]+" ");
                e +=1;
            }
        }

        if(s==n){
            for(int i = e ; i < m; i++){
                sb.append(arrB[i]+" ");
            }
        }
        if(e==m){
            for(int j = s ; j < n; j++){
                sb.append(arrA[j]+" ");
            }
        }

        System.out.println(sb);

    }
}
