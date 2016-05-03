public class Hackpack {
    // simple tests, not trying to break shit
    public static void main(String[] args) {
        Permutation p = new Permutation();
        System.out.println(p.index("1234"));

        Combination c = new Combination();
        System.out.println(c.index("1234"));

        Gcd g = new Gcd();
        System.out.println(g.index(40,16));

        Lcm l = new Lcm();
        int[] arr = {8,10};
        System.out.println(l.index(arr));

        // too long to test
        // Dijkstra d = new Dijkstra();

        LinesX2D x = new LinesX2D();
        System.out.println(x.index(1,2,3,4,5,6,7,8));

        // Test case from http://algs4.cs.princeton.edu/91primitives/Polygon.java.html
        Polygon poly = new Polygon();
        poly.add(5, 5);
        poly.add(9, 5);
        poly.add(9, 9);
        poly.add(5, 9);
        System.out.println(poly.area());
        System.out.println(poly.has_point(5, 5));
        System.out.println(poly.has_point(50, 6));

        

    }
}
