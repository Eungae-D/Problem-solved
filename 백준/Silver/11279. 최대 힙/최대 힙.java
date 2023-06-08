import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        PriorityQueue<Integer> queue = new PriorityQueue<>((o1,o2) -> o2-o1);
        for(int i = 0; i < N; i++){
            int input = Integer.parseInt(br.readLine());
            if(input==0){
                if(queue.isEmpty()){
                    System.out.println(0);
                }
                else{
                    System.out.println(queue.poll());
                }
                continue;
            }
            queue.add(input);
        }

        }
    }