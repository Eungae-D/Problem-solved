import java.util.Scanner;

public class Main {
    private static int size;
    private static int[]arr;
    private static int Findex,Eindex;
    private static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        size = sc.nextInt();
        arr = new int[size];
        Findex = 0;
        Eindex = 0;


        for(int i = 0 ; i < size; i++){
            String methods= sc.next();
            switch (methods){
                case "push" :
                    push(sc.nextInt());
                    break;
                case "front" :
                    sb.append(front()).append("\n");
                    break;
                case "back":
                    sb.append(back()).append("\n");
                    break;
                case "empty" :
                    sb.append(empty()).append(("\n"));
                    break;
                case "size" :
                    sb.append(size()).append("\n");
                    break;
                case "pop" :
                    sb.append(pop()).append(("\n"));
                    break;

            }
        }
        System.out.println(sb);

    }

    private static int pop() {
        if(Eindex-Findex==0){
            return -1;
        }
        else {
            int P = arr[Findex];
            Findex++;
            return P;

        }
    }

    private static int empty() {
        if(Eindex-Findex==0){
            return 1;
        }
        else return 0;
    }

    private static int size() {
        return Eindex-Findex;
    }

    private static int back() {
        if(Eindex-Findex==0) {
            return -1;
        }
        else{
            int B = arr[Eindex-1];
            return B;
        }
    }

    private static int front() {
        if(Eindex-Findex==0){
            return -1;
        }
        else {
            int F = arr[Findex];
            return F;
        }
    }

    private static void push(int input) {
        arr[Eindex] = input;
        Eindex++;
    }
}