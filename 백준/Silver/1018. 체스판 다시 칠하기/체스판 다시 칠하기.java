import java.util.Scanner;

public class Main {
    public static boolean[][] arr;
    public static int min = 64;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        arr = new boolean[N][M];

        for (int i = 0; i < N; i++) {
            String line = sc.next();
            for (int j = 0; j < M; j++) {
                if (line.charAt(j) == 'W') {
                    arr[i][j] = true;
                } else {
                    arr[i][j] = false;
                }
            }
        }

        //여기서부터는 몇번 돌아야하는지 설정
        // 예를들어 8 8은 한번만 돌면 됨으로
        int roundx = N - 7;
        int roundy = M - 7;

        for(int i = 0 ; i < roundx; i++){
            for(int j = 0 ; j < roundy; j++){
                find(i,j);
            }
        }
        System.out.println(min);


    }

    private static void find(int x, int y) {
        //범위설정 x,y인덱스
        int xIndex = x+8;
        int yIndex = y+8;
        int cnt = 0 ;

        boolean TorF = arr[x][y];

        for(int i = x ; i < xIndex; i++){
            for (int j = y; j < yIndex; j++) {

                if(arr[i][j]!=TorF){
                    cnt++;
                }
                TorF = (!TorF);

            }
            TorF = (!TorF);
        }
        //첫번째 칸이 w일수도 b일수도 있으므로
        cnt = Math.min(cnt,64-cnt);

        min = Math.min(min,cnt);

    }
}