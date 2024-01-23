import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        String input = sc.next();

        int[] check = new int[26];
        check[input.charAt(0)-'a']++;

        int s = 0;
        int e = 0;
        int cnt = 1;

        int max = Integer.MIN_VALUE;

        while(true){
            e++;

            if(e==input.length()){
                break;
            }

            int num = input.charAt(e)-'a';
            check[num]++;

            if(check[num]==1){
                cnt++;
            }

            while (cnt>n){
                int temp =input.charAt(s)-'a';
                check[temp]--;

                if(check[temp]==0){
                    cnt--;
                }
                s++;
            }


            max = Math.max(max, e-s+1);



        }
        System.out.println(max);

    }
}
