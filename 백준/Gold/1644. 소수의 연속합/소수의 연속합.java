import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> decimals =  new ArrayList<>();

        int n = sc.nextInt();

        boolean[] decimal = new boolean[n+1];

        for(int i = 0 ; i < decimal.length;i++){
            decimal[i]= true;
        }

        decimal[0] = decimal[1] = false;

        for(int i = 2; i <=n; i++){

            if(!decimal[i]) continue;

            for(long j = (long)i * i ; j <=n ; j+=i){
                if(decimal[(int)j]){
                    decimal[(int)j]=false;
                }
            }
        }

        for(int i = 2; i <=n; i++){
            if(decimal[i]){
                decimals.add(i);
            }
        }

        int s = 0;
        int e = 0;
        int sum = 2;
        int ans = 0;
        int size = decimals.size();

        while( s<size && e<size){
            if(sum<n){
                e++;
                if(e>=size) break;
                sum+=decimals.get(e);
            }else if(sum==n){
                ans++;
                sum -=decimals.get(s);
                s++;
            }else{
                sum -=decimals.get(s);
                s++;
            }
        }

        System.out.println(ans);



    }
}
