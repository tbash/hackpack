import java.util.*;

// dmarino special
public class Convex {
    public static int get_min(pt[] pts, int n) {
        int res = 0;
        for (int i=1; i<n; i++)
            if (pts[i].y < pts[res].y || (pts[i].y == pts[res].y && pts[i].x < pts[res].x))
                res = i;
        return res;
    }

    // grahamScan
    public static double index(pt[] pts, int n) {

        Arrays.sort(pts);

        Stack<pt> myStack = new Stack<pt>();
        myStack.push(pts[0]);
        myStack.push(pts[1]);

        for (int i=2; i<n; i++) {

            pt cur = pts[i];
            pt mid = myStack.pop();
            pt prev = myStack.pop();

            while (!prev.isRightTurn(mid, cur)) {
                mid = prev;
                prev = myStack.pop();
            }

            myStack.push(prev);
            myStack.push(mid);
            myStack.push(cur);
        }

        double res = 0;
        pt cur = pts[0];
        while (myStack.size() > 0) {
            pt next = myStack.pop();
            res += cur.dist(next);
            cur = next;
        }

        return res;
    }
}

class pt implements Comparable<pt> {

    public static int refX;
    public static int refY;

    public int x;
    public int y;

    public pt(int myx, int myy) {
        x = myx;
        y = myy;
    }

    public pt getVect(pt other) {
        return new pt(other.x-x, other.y-y);
    }

    public double dist(pt other) {
        return Math.sqrt((other.x-x)*(other.x-x) + (other.y-y)*(other.y-y));
    }

    public int crossProductMag(pt other) {
        return this.x*other.y - other.x*this.y;
    }

    public boolean isRightTurn(pt mid, pt next) {
        pt v1 = getVect(mid);
        pt v2 = mid.getVect(next);
        /*** Change to > 0 to skip collinear points. ***/
        return v1.crossProductMag(v2) >= 0;
    }

    public boolean isZero() {
        return x == 0 && y == 0;
    }

    public int compareTo(pt other) {

        pt myRef = new pt(refX, refY);
        pt v1 = myRef.getVect(this);
        pt v2 = myRef.getVect(other);

        if (v1.isZero()) return -1;
        if (v2.isZero()) return 1;

        if (v1.crossProductMag(v2) != 0)
            return -v1.crossProductMag(v2);

        if (myRef.dist(v1) < myRef.dist(v2)) return -1;
        return 1;
    }
}
