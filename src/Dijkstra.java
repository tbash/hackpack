import java.util.*;

// Pulled from examples
public class Dijkstra {
    int n, oo = (int) 1e9;
    ArrayList<Edge>[] g;

    int index(int s, int d) {

        boolean[] visited = new boolean[n];
        PriorityQueue<Edge> pq = new PriorityQueue<>();
        pq.add(new Edge(s, 0));

        while (!pq.isEmpty()) {

            Edge at = pq.poll();
            if (visited[at.e]) continue;
            visited[at.e] = true;

            if (at.e == d) return at.w;

            for (Edge adj : g[at.e])
                if (!visited[adj.e]) pq.add(new Edge(adj.e, adj.w + at.w));
        }
        return oo;
    }

    class Edge implements Comparable<Edge> {
        int e, w;

        Edge(int e, int w) {
            this.e = e;
            this.w = w;
        }

        public int compareTo(Edge o) {
            return w - o.w;
        }
    }
}

