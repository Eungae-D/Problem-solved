import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int input = sc.nextInt();

        int count = 0;

        for(int i = 1 ; i < 500; i++){
            for(int j = 1; j < 500 ; j++){
                if(Math.pow(i,2)-Math.pow(j,2)==input){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
