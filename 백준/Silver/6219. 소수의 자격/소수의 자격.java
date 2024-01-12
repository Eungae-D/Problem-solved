import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        int answer = 0;
        for(int i = a; i <=b; i++){
            if(isPrime(i)){

                int temp = i;
                while (temp !=0){
                    if(temp%10 ==c){
                       answer++;
                       break;
                    }
                    temp= temp/10;
                }
            }
        }
        System.out.println(answer);
    }

    public static boolean isPrime(int n) {
        if(n==1){
            return false;
        }

        for(int i = 2 ; i * i <=n; i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}
