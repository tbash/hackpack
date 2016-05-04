import java.awt.geom.*;

public class LinesX2D {
    //            |          line          |
    // so         | one point | another    | ....... blah blah
    boolean index(int a, int b, int c, int d, int e, int f, int g, int h) {
         return Line2D.linesIntersect(a, b, c, d, e, f, g, h);
    }
}
