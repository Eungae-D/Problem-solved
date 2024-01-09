import java.util.*;
import java.io.*;

public class Main {

    private static StringBuilder sb;
    private static StringTokenizer st;
    private static BufferedReader br;

    private static int n;
    private static int[][] arr;
    
    private static void sb(){
        sb = new StringBuilder();
    }
    
    private static void st() throws Exception{
        st = new StringTokenizer(br.readLine());
    }
    
    private static void input() throws Exception {
        br = new BufferedReader(new InputStreamReader(System.in));
        sb();
        st();

        n = Integer.parseInt(st.nextToken());
        arr = new int[n][2];

        for (int i = 0; i < n; i++) {
            st();
            
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }
    }


    private static void process() {
        int[] time = new int[1001];
        int totalTime = 0;

        for (int i = 0; i < n; i++) {
            for (int j = arr[i][0]; j < arr[i][1]; j++) {
                if (time[j] == 0) {
                    totalTime++;
                }
                time[j]++;
            }
        }

        int min = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = arr[i][0]; j < arr[i][1]; j++) {
                if (time[j] <= 1) {
                    count++;
                }
            }
            min = Math.min(min, count);
        }

        System.out.println(totalTime - min);
    }

    public static void main(String[] args) throws Exception {
        input();
        process();
    }
}
