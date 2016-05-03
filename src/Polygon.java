import java.awt.geom.*;
import java.util.*;

public class Polygon {
    ArrayList<Point2D.Double> points;

    public Polygon() {
        points = new ArrayList<>();
    }

    public void add(double x, double y) {
        points.add(new Point2D.Double(x,y));
    }

    public boolean has_point(double x, double y) {
        boolean in = false;
        for (int i = 0, j = points.size() - 1; i < points.size(); j = i++) {
            if ((points.get(i).y > y) != (points.get(j).y > y) &&
                    (x < (points.get(j).x - points.get(i).x) * (y - points.get(i).y) /
                            (points.get(j).y-points.get(i).y) + points.get(i).x)) in = !in;
        }
        return in;
    }

    public double area() {
        double a = 0;
        for (int i = 0; i < points.size(); i++) {
            Point2D.Double from = points.get(i);
            Point2D.Double to = points.get((i + 1) % points.size());
            a = a + from.getX() * to.getY() - from.getY() * to.getX();
        }
        return 0.5 * Math.abs(a);
    }
}