import java.util.Scanner;

public class Main {
    private static int size = 0;
    private static int[] arr = new int[20001];
    private static int firstIndex = 10000;
    private static int endIndex = 10000;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        StringBuilder sb = new StringBuilder();

        int round = sc.nextInt();
        for (int i = 0; i < round; i++) {
            String input = sc.next();

            switch (input) {
                case "push_front":
                    push_front(sc.nextInt());
                    break;
                case "push_back":
                    push_back(sc.nextInt());
                    break;
                case "pop_front":
                    sb.append(pop_front()).append("\n");
                    break;
                case "pop_back":
                    sb.append(pop_back()).append("\n");
                    break;
                case "size":
                    sb.append(size()).append("\n");
                    break;
                case "empty":
                    sb.append(empty()).append("\n");
                    break;
                case "front":
                    sb.append(front()).append("\n");
                    break;
                case "back":
                    sb.append(back()).append("\n");
                    break;
            }

        }
        System.out.println(sb);


    }

    private static int back() {
        if(size==0){
            return -1;
        }
        return arr[endIndex];
    }

    private static int front() {
        if(size==0){
            return -1;
        }
        return arr[firstIndex+1];
    }

    private static int empty() {
        if(size==0){
            return 1;
        }
        return 0;
    }

    private static int size() {
        return size;
    }

    private static int pop_back() {
        if(size==0){
            return -1;
        }
        int ans = arr[endIndex];
        endIndex--;
        size--;
        return ans;
    }

    private static int pop_front() {
        if(size==0){
            return -1;
        }
        int ans = arr[firstIndex+1];
        firstIndex++;
        size--;
        return ans;
    }

    private static void push_back(int input) {
        endIndex++;
        size++;
        arr[endIndex] =input;
    }

    private static void push_front(int input) {
        arr[firstIndex] =input;
        firstIndex--;
        size++;
    }
}