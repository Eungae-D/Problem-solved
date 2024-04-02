import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

class Main {
    static ArrayList<Node>[] list;
    private static int V;
    private static int E;
    private static int[] distance;
    private static int start;
    private static int INF = Integer.MAX_VALUE;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        V = sc.nextInt();
        E = sc.nextInt();
        start = sc.nextInt();
        list = new ArrayList[V + 1];
        distance = new int[V + 1];
        for (int i = 1; i <= V; i++) {
            list[i] = new ArrayList<>();
        }
        Arrays.fill(distance, INF);
        distance[start] = 0;
        for (int i = 0; i < E; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            int w = sc.nextInt();
            list[u].add(new Node(v, w));
        }
        dijkstra();
        for (int i = 1; i <= V; i++) {
            if (distance[i] == INF) {
                System.out.println("INF");
            } else {
                System.out.println(distance[i]);
            }
        }
    }

    private static void dijkstra() {
        PriorityQueue<Node> queue = new PriorityQueue<>();
        queue.add(new Node(start, 0));
        while (!queue.isEmpty()) {
            Node node = queue.poll();
            if (distance[node.vertex] < node.edge) {
                continue;
            }
            for (int i = 0; i < list[node.vertex].size(); i++) {
                Node node2 = list[node.vertex].get(i);
                int vertex2 = node2.vertex;
                int edge2 = node2.edge + node.edge;
                if (distance[vertex2] > edge2) {
                    distance[vertex2] = edge2;
                    queue.add(new Node(vertex2, edge2));
                }
            }
        }

    }

    public static class Node implements Comparable<Node> {
        int vertex;
        int edge;

        public Node(int vertex, int edge) {
            this.vertex = vertex;
            this.edge = edge;
        }

        @Override
        public int compareTo(Node o) {
            return edge - o.edge;
        }
    }
}