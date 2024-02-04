
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    private static BufferedReader br;
    private static StringTokenizer st;
    private static StringBuilder sb;
    private static int A,B,C;
    private static int[]arrA,arrB,arrC;
    private static int answer;

    public static void input() throws Exception{
        br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());
        sb = new StringBuilder();

        A = Integer.parseInt(st.nextToken());
        B = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());

        arrA = new int[A];
        arrB = new int[B];
        arrC = new int[C];

        st = new StringTokenizer(br.readLine());

        for(int i = 0 ; i < A ; i++){
            arrA[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());

        for(int i = 0 ; i < B ; i++){
            arrB[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());

        for(int i = 0 ; i < C ; i++){
            arrC[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arrA);
        Arrays.sort(arrB);
        Arrays.sort(arrC);

        answer = Integer.MAX_VALUE;

    }

    public static void process(){
        for(int i = 0 ; i < A ; i++){
            int a = arrA[i];
            int b = search(a,arrB);
            int c1 = search(a,arrC);
            int c2 = search(b,arrC);

            int max1 = Math.max(Math.max(a,b),c1);
            int min1 = Math.min(Math.min(a,b),c1);

            int ans1 = max1-min1;

            int max2 = Math.max(Math.max(a,b),c2);
            int min2 = Math.min(Math.min(a,b),c2);

            int ans2 = max2-min2;

            answer = Math.min(answer,Math.min(ans1,ans2));
        }

        System.out.println(answer);
    }

    public static int search(int x, int[] arr){
        int s = 0;
        int e = arr.length-1;
        int mid = (s+e)/2;
        int ans = arr[mid];

        while (s<=e){
            mid = (s+e)/2;
            if(arr[mid]==x) return x;
            if(arr[mid]<x){
                s = mid+1;
            }else if(arr[mid]>x){
                e = mid-1;
            }

            if(Math.abs(ans-x)>Math.abs(arr[mid]-x)){
                ans = arr[mid];
            }
        }
        return ans;

    }



    public static void main(String[] args) throws Exception{
        input();
        process();

    }
}
