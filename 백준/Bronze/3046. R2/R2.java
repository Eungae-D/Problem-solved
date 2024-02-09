import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=  new Scanner(System.in);


        int R1 = sc.nextInt();
        int S  = sc.nextInt();

        for(int i = -1000; i<=1000; i++){
            if((R1+i)/2==S){
                System.out.println(i);
                return;
            }
        }

    }
}
