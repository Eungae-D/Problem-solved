import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int student = Integer.parseInt(st.nextToken());

        int answer = 0;
        outer : for(int i = 0; i <= 50; i++){
                    for(int j = 0; j <= 50; j++){
                        for(int k = 0; k <= 50; k++){
                            if(i*a+j*b+k*c==student){
                            answer = 1;
                            break outer;
                    }
                }
            }
        }

        if(answer == 0){
            System.out.println(0);
        }else{
            System.out.println(answer);
        }

    }
}
