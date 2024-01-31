import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    private static int T, n, m;
    private static int[] a, b;
    private static List<Integer> subA, subB;


    public static void main (String [] arg) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        T = Integer.parseInt(br.readLine());

        n = Integer.parseInt(br.readLine());
        a = new int[n];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++)
            a[i] = Integer.parseInt(st.nextToken());

        m = Integer.parseInt(br.readLine());
        b = new int[m];

        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < m; i++)
            b[i] = Integer.parseInt(st.nextToken());

        subA = new ArrayList<>();

        int tmpSum = 0;

        for (int i = 0; i < n; i++) {
            tmpSum = 0;
            for (int j = i; j < n; j++) {
                tmpSum += a[j];
                subA.add(tmpSum);
            }
        }


        subB = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            tmpSum = 0;
            for (int j = i; j < m; j++) {
                tmpSum += b[j];
                subB.add(tmpSum);
            }
        }

        Collections.sort(subA);
        Collections.sort(subB);


        int s = 0;
        int e = subB.size()-1;
        long cnt = 0;
        while(s < subA.size() && e >= 0) {
            int sum = subA.get(s) + subB.get(e);

            if(sum == T) {
                long a = subA.get(s);
                long b = subB.get(e);
                long cntA = 0;
                long cntB = 0;

                while (s < subA.size() && subA.get(s) == a) {
                    cntA++;
                    s++;
                }
                while (e >= 0 && subB.get(e) == b) {
                    cntB++;
                    e--;
                }

                cnt += cntA*cntB;
            }

            else if (sum > T) e--;

            else if (sum < T) s++;
        }

        System.out.println(cnt);
    }
}
