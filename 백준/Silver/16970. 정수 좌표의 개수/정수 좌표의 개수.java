import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();

        int ans = 0;
        for(int x1 = 0 ; x1 <=n; x1++){
            for(int y1 = 0 ; y1 <=m ; y1++){
                for(int x2 = 0 ; x2<=n ; x2++){
                    for(int y2 = 0 ; y2<=m ; y2++){
                        if(gcd(Math.abs(x2-x1),(Math.abs(y2 - y1)))+1==k){
                            ans++;
                        }
                    }
                }
            }
        }
        System.out.println(ans/2);
    }
    public static int gcd(int a, int b){
        if(a==0||b == 0){
            return a + b;
        }
        while(a%b!=0){
            int temp = a%b;
            a= b;
            b = temp;
        }
        return b;
    }
}
