
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    private static BufferedReader br;
    private static StringBuilder sb;
    private static StringTokenizer st;
    private static int x,y,z;
    private static int ans,left,right;

    public static void input() throws Exception {
        br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());
        sb = new StringBuilder();

        x = Integer.parseInt(st.nextToken());
        y = Integer.parseInt(st.nextToken());

        ans = -1;
    }

    public static int getP(int x, int y){
        return (int) ((long) y * 100 / x);
    }

    public static void process(){
        z = getP(x, y);

        left = 0;
        right = (int)1000000000;

        while (left <= right){
            int mid = (left + right) / 2;

            if(getP(x+mid, y+mid) != z){
                ans = mid;
                right = mid-1;
            }else{
                left = mid+1;
            }
        }
        System.out.println(ans);
    }

    public static void main(String[] args) throws Exception{
        input();
        process();
    }
}
