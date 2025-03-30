import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception{
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                StringTokenizer st = new StringTokenizer(br.readLine());
                long gcd = Long.parseLong(st.nextToken());
                long lcm = Long.parseLong(st.nextToken());
                long ans1 = gcd, ans2 = lcm;

                long xy = gcd * lcm;


                for (long i = 2 * gcd; i * i <= xy; i += gcd) {
                    if (xy % i == 0) {
                        long tmp = xy / i;

                        if (gcd(i, tmp) == gcd) {
                            if (ans1 + ans2 > i + tmp) {
                                ans1 = i;
                                ans2 = tmp;
                            }
                        }
                    }
                }

                System.out.println(ans1 + " " + ans2);

        }
        private static long gcd(long a, long b){
            if(b == 0){
                return a;
            }
            
            while(a%b != 0){
                long temp = a%b;
                a = b;
                b = temp;
                
            }
            return b;
        }

//        private static long gcd(long a, long b) {
//            return b == 0 ? a : gcd(b, a % b);
//        }
    }

