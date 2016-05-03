import java.awt.*;
import java.util.*;

public class Polygon {
    ArrayList<Point> points = new ArrayList<>();

    void add(int x, int y) {
        points.add(new Point(x,y));
    }

    boolean has_point(int x, int y) {
        boolean in = false;
        for (int i = 0, j = points.size() - 1; i < points.size(); j = i++) {
            if ((points.get(i).y > y) != (points.get(j).y > y) &&
                    (x < (points.get(j).x - points.get(i).x) * (y - points.get(i).y) /
                            (points.get(j).y-points.get(i).y) + points.get(i).x)) in = !in;
        }
        return in;
    }

    double area() {
        double a = 0;
        for (int i = 0; i < points.size(); i++) {
            Point s = points.get(i);
            Point e = points.get((i + 1) % points.size());
            a = a + s.x * e.y - s.y * e.x;
        }
        return 0.5 * Math.abs(a);
    }
}