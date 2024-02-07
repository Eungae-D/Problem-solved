import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    private static StringBuilder sb;
    private static BufferedReader br;
    private static StringTokenizer st;
    private static int N,M,L;
    private static int ans;
    private static int[] pad;
    private static Animal[] animals;

    private static class Animal{
        int r,c;
        public Animal(int r, int c) {
            this.r = r;
            this.c = c;
        }
    }


    public static void input() throws Exception{
        sb = new StringBuilder();
        br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());

        M= Integer.parseInt(st.nextToken());
        N= Integer.parseInt(st.nextToken());
        L= Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        // 사대
        pad = new int[M];
        for(int i = 0 ; i < M ; i++){
            pad[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(pad);

        // 동물 위치
        animals = new Animal[N];
        for(int i = 0 ; i < N ; i++){
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            animals[i] = new Animal(x,y);
        }
        // 실행
        process();
    }


    public static void process(){
        for(int i = 0 ; i < N; i++){
            if(animals[i].c > L){
                continue;
            }
            if(binarySearch(i)){
                ans++;
            }
        }
        System.out.println(ans);
    }

    public static boolean binarySearch(int idx){
        int s = 0;
        int e = M-1;
        int mid = -1;

        while (s<=e){
            mid = (s+e)/2;
            //사정거리
            int dist = getDist(animals[idx].r,animals[idx].c,pad[mid]);
            if(L<dist && animals[idx].r< pad[mid]){
                e = mid -1;
            }else if(L < dist && animals[idx].r >= pad[mid]){
                s = mid +1;
            }else if(L >=dist){
                return true;
            }
        }
        return false;
    }

    public static int getDist(int a, int b , int x){
        return Math.abs(x-a)+b;
    }

    public static void main(String[] args) throws Exception{
        input();
    }
}
