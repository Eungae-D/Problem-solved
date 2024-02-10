import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        int D = sc.nextInt();

        B+= D/60;
        C+= D%60;

        B+= C/60;
        C = C%60;

        A += B/60;
        B = B%60;

        A = A%24;

        System.out.println(A+" "+B+" "+C);
    }
}
