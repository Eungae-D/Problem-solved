import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int B = sc.nextInt();
        int W = sc.nextInt();

        char[] arr = new char[n+1];

        String input = sc.next();

        for(int i = 0 ; i < input.length(); i++){
            arr[i] = input.charAt(i);
        }

        int s = 0;
        int e = 0;
        int answer = Integer.MIN_VALUE;

        int wCount = 0;
        int bCount = 0;
        while(e<n){
            if(arr[e]=='W'){
                wCount++;
                e++;
            }else{
                bCount++;
                e++;
                while (bCount > B) {
                    if (arr[s] == 'W') {
                        wCount--;
                    } else {
                        bCount--;
                    }
                    s++;

                }
            }
            if (wCount >= W) {
                answer = Math.max(answer, e - s);
            }

        }
        
        if(answer==Integer.MIN_VALUE){
            System.out.println(0);
        }else{
            System.out.println(answer);
        }
        

    }
}
