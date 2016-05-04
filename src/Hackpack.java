import java.util.*;

public class Hackpack {
    // simple tests, not trying to break shit
    public static void main(String[] args) {
        System.out.println(new Permutation().index("1234"));

        System.out.println(new Combination().index("1234"));

        System.out.println(new Gcd().index(40,16));

        int[] arr = {8,10};
        System.out.println(new Lcm().index(arr));

        // too long to test plus not my code
        // Dijkstra d = new Dijkstra();

        System.out.println(new LinesX2D().index(1,2,3,4,5,6,7,8));

        // Test case from http://algs4.cs.princeton.edu/91primitives/Polygon.java.html
        Polygon poly = new Polygon();
        poly.add(5, 5);
        poly.add(9, 5);
        poly.add(9, 9);
        poly.add(5, 9);
        System.out.println(poly.area());
        System.out.println(poly.has_point(5, 5));
        System.out.println(poly.has_point(50, 6));

        // Test case from princeton
        int total = 2000;
        int[] values = {874,620,345,369,360,470},
                weights = {580,1616,1906,1942,50,294};
        System.out.println(new Knapsack().index(total, values, weights));

        // From dmarino
        System.out.println(new Lcs().index("YECNQCGKAF","LYECNERSKA"));

        pt[] pts = new pt[13];
        pts[0] = new pt(1,2);
        pts[1] = new pt(2,2);
        pts[2] = new pt(4,3);
        pts[3] = new pt(6,5);
        pts[4] = new pt(8,9);
        pts[5] = new pt(1,9);
        pts[6] = new pt(11,4);
        pts[7] = new pt(4,3);
        pts[8] = new pt(0,1);
        pts[9] = new pt(1,3);
        pts[10] = new pt(8,8);
        pts[11] = new pt(5,2);
        pts[12] = new pt(1,0);
        System.out.printf("%.1f\n", new Convex().index(pts, pts.length));

        int n = 10;
        List<Integer>[] g = new List[n];
        for (int i = 0; i < n; i++) {
            g[i] = new ArrayList<>();
        }
        g[8].add(9);
        g[1].add(4);
        g[1].add(2);
        g[4].add(2);
        g[4].add(3);
        g[3].add(2);
        g[5].add(2);
        g[3].add(5);
        g[8].add(2);
        g[8].add(6);
        System.out.println(new Topological().index(g));

        Prims prims = new Prims();

        int b = 5;
        int[][] graph = {
                        {999, 2, 999, 6, 999},
                        {2, 999, 3, 8, 5},
                        {999, 3, 999, 999, 7},
                        {6, 8, 999, 999, 9},
                        {999, 5, 7, 9, 999},
        };
        prims.index(graph,b);

    }
}
