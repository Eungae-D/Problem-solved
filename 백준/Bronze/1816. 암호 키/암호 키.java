import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for(int i = 0 ; i < n ; i ++){
            long m = sc.nextLong();
            boolean isPrime = true;
            for(int j = 2 ; j < 1000001; j++){
                if(m%j == 0 ){
                    isPrime = false;
                    break;
                }
            }
            if(!isPrime){
                System.out.println("NO");
            }else{
                System.out.println("YES");
            }
        }
    }
}
