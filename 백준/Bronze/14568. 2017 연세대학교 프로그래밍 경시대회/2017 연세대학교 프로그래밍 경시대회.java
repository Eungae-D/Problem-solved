import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int candy = sc.nextInt();

        int count = 0;

        for(int i = 1 ; i < 100; i++){
            for(int j = 1; j < 100; j++){
                for(int k = 1; k < 100; k++){
                    if(candy-(i+j+k)==0 && k>=j+2 && i%2==0){
                        count++;
                    }
                }
            }
        }
        if(count==0){
            System.out.println(0);
        }else{
            System.out.println(count);
        }
    }
}
