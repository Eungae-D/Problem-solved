import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    private static StringBuilder sb;
    private static BufferedReader br;
    private static StringTokenizer st;
    private static int N;
    private static int[] prices;
    private static ArrayList<ArrayList<SaleInfo>> list;
    private static boolean[] visited;
    private static int minCost = Integer.MAX_VALUE;

    private static class SaleInfo {
        private int number;
        private int discount;

        public SaleInfo(int number, int discount){
            this.number = number;
            this.discount = discount;
        }
    }


    public static void input() throws Exception {
        br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();
        st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());

        list = new ArrayList<>();
        for(int i = 0 ; i < N; i++){
            list.add(new ArrayList<>());
        }

        prices = new int[N];

        st = new StringTokenizer(br.readLine());
        for(int i = 0 ; i < N ; i++){
            prices[i] = Integer.parseInt(st.nextToken());
        }

        for(int i = 0 ; i < N ; i++){
            int temp = Integer.parseInt(br.readLine());

            for(int j = 0 ; j < temp; j++){
                st = new StringTokenizer(br.readLine());

                int idx = Integer.parseInt(st.nextToken());
                int discountPrice = Integer.parseInt(st.nextToken());
                list.get(i).add(new SaleInfo(idx,discountPrice));
            }
        }

        visited = new boolean[N];
    }

    public static void recur(int cur, int totalCost, int[] currentPrices){
        if(cur == N){
            minCost = Math.min(minCost, totalCost);
            return;
        }

        for(int i = 0 ; i < N ; i++){
            if(visited[i]) continue;

            int[] newPrices = currentPrices.clone();

            for(SaleInfo saleInfo : list.get(i)){
                newPrices[saleInfo.number-1] = Math.max(1,newPrices[saleInfo.number-1] - saleInfo.discount);
            }

            visited[i] = true;
            recur(cur+1, totalCost + newPrices[i], newPrices);
            visited[i] = false;
        }
    }

    public static void process() {
        recur(0,0,prices);
        System.out.println(minCost);
    }


    public static void main(String[] args) throws Exception {
        input();
        process();
    }
}
