import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    private static BufferedReader br;
    private static StringTokenizer st;
    private static StringBuilder sb;
    private static int h,w,water;
    private static int[] blocks,prefix,suffix;

    private static void input() throws Exception{
        br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());

        blocks = new int[502];
        prefix = new int[502];
        suffix = new int[502];

        h = Integer.parseInt(st.nextToken());
        w = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());

        for(int i = 1; i<=w; i++){
            blocks[i] = Integer.parseInt(st.nextToken());
        }
    }

    private static void process(){
        for(int i = 1; i <=w; i++){
            prefix[i] = Math.max(prefix[i-1],blocks[i]);
        }

        for(int i = w; i>=1; i--){
            suffix[i] = Math.max(suffix[i+1],blocks[i]);
        }

        for(int i = 0 ; i < blocks.length;i++){
            water+= Math.min(prefix[i],suffix[i]);
        }

        for(int i = 0 ; i < blocks.length;i++){
            water-=blocks[i];
        }

        System.out.println(water);


    }

    public static void main(String[] args) throws Exception{
        input();
        process();
    }
}
