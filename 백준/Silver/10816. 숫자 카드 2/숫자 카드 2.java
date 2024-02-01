
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    private static BufferedReader br;
    private static StringBuilder sb;
    private static StringTokenizer st;
    private static int n,m;
    private static int[] arr;

    public static void input() throws Exception{
        br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();
        st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());

        arr = new int[n];
        for(int i = 0 ; i < n ; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);

        st = new StringTokenizer(br.readLine());

        m = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        for(int i = 0 ; i < m ; i++){
            process(Integer.parseInt(st.nextToken()));
        }



    }

    public static void process(int x){
        int leftS = 0;
        int leftE = n-1;

        int rightS =0;
        int rightE = n-1;

        int leftIndex=-1;
        int rightIndex=-1;

        boolean foundLeft = false;
        boolean foundRight = false;

        //leftIndex x를 포함하며 제일 왼쪽
        while(leftS<=leftE){
            int mid = (leftS+leftE)/2;
            if(arr[mid]>x){
                leftE = mid-1;
            }else if(arr[mid]<x){
                leftS = mid+1;
            }else{
                leftIndex = mid;
                leftE= mid-1;
                foundLeft = true;
            }
        }

        //rightIndex x를 포함하여 제일 오른쪽
        while(rightS<=rightE){
            int mid = (rightS+rightE)/2;
            if(arr[mid]>x){
                rightE = mid-1;
            }else if(arr[mid]<x){
                rightS = mid+1;
            }else{
                rightIndex = mid;
                rightS= mid+1;
                foundRight = true;
            }
        }


        if (!foundLeft || !foundRight) {
            sb.append(0).append(" ");
        } else {
            sb.append(rightIndex - leftIndex + 1).append(" ");
        }
    }

    public static void main(String[] args) throws Exception{
        input();
        System.out.println(sb);
    }
}
