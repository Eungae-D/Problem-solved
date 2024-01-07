import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[10];

        for(int i = 0 ; i < 10; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }

        int sum = 0;
        int height = 0;
        int nextHeight = 0;


        for(int i = 0 ; i < 10; i++){
            sum+= arr[i];
            if(sum <= 100){
                height = sum;
            }else if(sum > 100){
                nextHeight = sum;
                break;
            }
        }


        if(Math.abs(100-height)>Math.abs(100-nextHeight)){
            System.out.println(nextHeight);
        }else if(Math.abs(100-height)<Math.abs(100-nextHeight)){
            System.out.println(height);
        }else{
            System.out.println(nextHeight);
        }

    }
}
