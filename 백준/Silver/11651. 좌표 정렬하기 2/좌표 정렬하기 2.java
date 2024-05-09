
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
	static class Node implements Comparable<Node> {
		int x;
		int y;

		public Node(int x, int y) {
			this.x = x;
			this.y = y;
		}

		@Override
		public int compareTo(Node o) {
			if (this.y == o.y) {
				return this.x - o.x;
			}
			return this.y - o.y;
		}

	}

	// 노드만들어서 comparable이용하는방법으로
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int size = sc.nextInt();

		PriorityQueue<Node> q = new PriorityQueue<>();

		for (int i = 0; i < size; i++) {
			int nodex = sc.nextInt();
			int nodey = sc.nextInt();
			q.add(new Node(nodex, nodey));
		}
		
		while(!q.isEmpty()) {
			Node ans = q.poll();
			System.out.println(ans.x+" "+ans.y);
		}

	}

}
