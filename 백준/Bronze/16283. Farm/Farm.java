import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        int n = sc.nextInt();
        int w = sc.nextInt();

        int count = 0;
        int sheep = 0;
        int cow = 0;
        for(int i = 1; i < 1000; i++){
            for(int j = 1; j <1000 ; j++){
                if(i+j==n && i*a+j*b==w){
                    sheep = i;
                    cow = j;
                    count++;
                }
            }
        }
        if(count==0||count>=2){
            System.out.println(-1);
        }else{
            System.out.println(sheep+" "+cow);
        }
    }
}
