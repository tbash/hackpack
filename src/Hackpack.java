public class Hackpack {
    // simple tests, not trying to break shit
    public static void main(String[] args) {
        System.out.println(new Permutation().index("1234"));

        System.out.println(new Combination().index("1234"));

        System.out.println(new Gcd().index(40,16));

        int[] arr = {8,10};
        System.out.println(new Lcm().index(arr));

        // too long to test
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


    }
}
