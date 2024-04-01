import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	static class Node {
		int x;
		int y;
		int len;

		public Node(int x, int y, int len) {
			this.x = x;
			this.y = y;
			this.len = len;
		}
	}

	static int[] dx = { -2, -1, 1, 2, 2, 1, -1, -2 };
	static int[] dy = { 1, 2, 2, 1, -1, -2, -2, -1 };
	static boolean[][] visited;
	static int[][] map;
	static int size, move;
	static int memox, memoy;
	static int endx, endy;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();

		for (int tc = 1; tc <= T; tc++) {
			size = sc.nextInt();
			map = new int[size][size];
			visited = new boolean[size][size];

			memox = sc.nextInt();
			memoy = sc.nextInt();

			endx = sc.nextInt();
			endy = sc.nextInt();

			bfs(memox, memoy, 0);

		}
	}

	private static void bfs(int p, int q, int len) {
		Queue<Node> que = new LinkedList<>();
		int x = p;
		int y = q;
		int length = len;
		
		que.offer(new Node(x, y, length));
		visited[x][y] = true;

		while (!que.isEmpty()) {
			Node n = que.poll();
			int xx = n.x;
			int yy = n.y;
			int ll = n.len;

			if (xx == endx && yy == endy) {
				System.out.println(ll);
				return;
			}

			for (int i = 0; i < 8; i++) {
				int dr = xx + dx[i];
				int dc = yy + dy[i];

				if (dr < 0 || dc < 0 || dr >= size || dc >= size) {
					continue;
				}

				if (!visited[dr][dc] && map[dr][dc] == 0) {
					que.offer(new Node(dr, dc, ll + 1));
					visited[dr][dc] = true;
				}
			}

		}
	}
}