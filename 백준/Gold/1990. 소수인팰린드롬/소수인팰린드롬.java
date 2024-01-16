import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        boolean[] isPrime = new boolean[100000001];

        for(int i = 0; i <isPrime.length; i++){
            isPrime[i] = true;
        }

        isPrime[0] = false;
        isPrime[1] = false;

        int a = sc.nextInt();
        int b = sc.nextInt();

        for(int i = 2 ; i *i <=100000000; i++){
            if(isPrime[i]){
                for(int j = i* i ; j<=100000000; j+=i){
                    isPrime[j] = false;
                }
            }
        }

        for(int i = a ;  i <=b; i++){
            if(isPrime[i] && isPalindrome(i)){
                sb.append(i).append("\n");
            }
        }
        sb.append(-1);
        System.out.println(sb);
    }

    public static boolean isPalindrome(int i) {
        int input = i;
        int reverseNumber = 0;

        while( i!=0){
            int lastNumber = i%10;
            reverseNumber = reverseNumber*10+lastNumber;
            i /=10;
        }
        if(input ==reverseNumber){
            return true;
        }else{
            return false;
        }
    }

}
