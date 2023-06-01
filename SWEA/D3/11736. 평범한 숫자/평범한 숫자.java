import java.util.Scanner;
 
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int T = sc.nextInt();
 
        for (int tc = 1; tc <= T; tc++) {
            //몇번 반복?
            int round = sc.nextInt();
            int arr[] = new int[round];
 
            int realcnt = 0;
            for (int i = 0; i < round; i++) {
                arr[i] = sc.nextInt();
            }
 
            for (int i = 1; i < round - 1; i++) {
                if((arr[i]>arr[i-1]&&arr[i]<arr[i+1])||(arr[i]>arr[i+1]&&arr[i] < arr[i - 1])){
                        realcnt++;
                }
            }
            System.out.print("#"+tc+" ");
            System.out.println(realcnt);
 
        }
    }
}