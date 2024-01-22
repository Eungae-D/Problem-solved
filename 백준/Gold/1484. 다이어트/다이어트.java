import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int g = sc.nextInt();

        long s = 1;
        long e = 2;

        
        boolean flag = false;
        while(e<50001){
            long difValue = e*e-s*s;

            if(difValue==g){
                sb.append(e+"\n");
                flag =true;
            }

            if(difValue<g){
                e++;
            }else{
                s++;
            }
        }

        if(flag){
            System.out.println(sb);
        }else{
            System.out.println(-1);
        }


    }
}
