import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {
    private static StringBuilder sb;
    private static BufferedReader br;
    private static StringTokenizer st;
    private static int N;
    private static int A,B;
    private static int[][] arr;
    private static int ans;
    public static class Point{
        int x;
        int y;

        Point(int x, int y){
            this.x = x;
            this.y = y;
        }
    }

    //입력
    public static void input() throws Exception {
        br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();

        N = Integer.parseInt(br.readLine());

        st = new StringTokenizer(br.readLine());
        A = Integer.parseInt(st.nextToken());
        B = Integer.parseInt(st.nextToken());

        arr = new int[N][2];

        for(int i = 0 ; i < N ; i++){
            st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2){
                return o1[0]!=o2[0] ? o1[0]-o2[0] : o1[1]-o2[1];
            }
        });
    }
    public static boolean check(Point p){
        int s = 0;
        int e = N-1;

        while(s<=e){
            int mid = (s+e)/2;

            if(arr[mid][0] == p.x && arr[mid][1] == p.y){
                return true;
            } else if (arr[mid][0]<p.x || (arr[mid][0] == p.x && arr[mid][1] < p.y)) {
                s = mid+1;
            }else{
                e = mid-1;
            }
        }
        return false;
    }

    //실행
    public static void process() {
        for(int i = 0 ; i < N ; i++){
            int x = arr[i][0];
            int y = arr[i][1];

            Point p1 = new Point(x+A, y);
            Point p2 = new Point(x+A,y+B);
            Point p3 = new Point(x,y+B);

            if(check(p1)&&check(p2)&&check(p3)){
                ans++;
            }
        }
        System.out.println(ans);
    }


    public static void main(String[] args) throws Exception {
        input();
        process();
    }
}
