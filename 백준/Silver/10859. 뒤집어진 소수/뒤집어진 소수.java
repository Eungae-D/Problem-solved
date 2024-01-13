import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();


        long n = Long.parseLong(st.nextToken());

        if(!isPrime(n)){
            System.out.println("no");
        }else{
            if(checkNum(n)){
                System.out.println("no");
            }else{
                long ans = changeNum(n);
                if(isPrime(ans)){
                    System.out.println("yes");
                }else{
                    System.out.println("no");
                }
            }
        }


    }

    public static boolean isPrime(long input){
        if (input ==1 ) return false;
        for(long i = 2 ; i * i <= input; i++){
            if(input %i ==0){
                return false;
            }
        }
        return true;
    }

    public static boolean checkNum(long input){
        long temp = input;

        while (temp>0){
           if(temp %10 ==3 ||temp %10 ==4|| temp %10 ==7){
               return true;
           }
            temp /= 10;
        }
        return false;
    }

    public static long changeNum(long input) {
        long result = 0;
        while(input>0){
            if(input % 10 ==6){
                result = result*10 +9;
            }else if(input % 10 == 9){
                result = result * 10+6;
            }else{
                result = result * 10 + input%10;
            }
            input /=10;
        }
        return result;
    }
}
