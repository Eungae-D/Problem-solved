import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();

        int n = Integer.parseInt(sc.nextLine());

        for(int i = 0 ; i < n ; i++){

            list.clear();
            String[] arr = sc.nextLine().split(" ");

            for(int j = 0 ; j < arr.length; j++){
                list.add(Integer.parseInt(arr[j]));
            }

            int max = Integer.MIN_VALUE;
            for(int j = 0 ; j < list.size()-1; j++){
                for(int k = j+1 ; k < list.size(); k++){
                    //여기서 유클리드 호제법
                    int a = list.get(j);
                    int b = list.get(k);
                   while (a%b!=0){
                       int tmp = a%b;
                       a = b;
                       b = tmp;
                   }
                   if(max<b){
                       max = b;
                   }
                }
            }
            System.out.println(max);
        }
    }
}
