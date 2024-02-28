import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    private static StringBuilder sb;
    private static BufferedReader br;
    private static StringTokenizer st;
    private static int[][] arr = new int[9][9];


    public static void input() throws Exception {
        br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();

        for(int i = 0 ; i < 9 ; i++){
            st = new StringTokenizer(br.readLine());
            for(int j = 0 ; j < 9 ; j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
    }
    public static boolean check(int row, int col, int num){
        //0, 0 , 1
        for(int i = 0 ; i < 9 ; i++){
            if(arr[row][i] == num){
                return false;
            }
        }

        for(int i = 0 ; i < 9 ; i++){
            if(arr[i][col] ==num){
                return false;
            }
        }

        int startRow = (row/3)*3;
        int startCol = (col/3)*3;
        for(int i = 0 ; i < 3 ; i++){
            for(int j = 0 ; j < 3 ; j++){
                if(arr[startRow+i][startCol+j]==num){
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean recur(int cur){
        if(cur == 81){
            return true;
        }

        int row = cur / 9;
        int col = cur % 9;

        if(arr[row][col] != 0){
            return recur(cur+1);
        }

        for(int i = 1 ; i <= 9; i++){
           if(check(row,col,i)){
               arr[row][col] = i;
               if(recur(cur+1)){
                  return true;
               }
               arr[row][col] = 0;
           }
        }
        return false;
    }

    public static void process() {
        if(recur(0)){
           for(int i = 0 ; i < 9 ; i++){
               for(int j = 0 ; j < 9 ; j++){
                   sb.append(arr[i][j]).append(" ");
               }
               sb.append("\n");
           }
        }
        System.out.println(sb.toString());
    }

    public static void main(String[] args) throws Exception {
        input();
        process();
    }
}
