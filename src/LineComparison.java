import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

class Point {
    private final double x;
    private final double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() { return x; }
    public double getY() { return y; }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}
class Line implements Comparable<Line> {

    private final Point p1;
    private final Point p2;
    private final double length;

    private static final double EPSILON = 1e-6;

    public Line(Point p1, Point p2) {
        this.p1 = Objects.requireNonNull(p1);
        this.p2 = Objects.requireNonNull(p2);
        this.length = computeLength();
    }

    private double computeLength() {
        double dx = p2.getX() - p1.getX();
        double dy = p2.getY() - p1.getY();
        return Math.sqrt(dx * dx + dy * dy);
    }

    public double getLength() {
        return length;
    }

    @Override
    public String toString() {
        return "Line[" + p1 + " -> " + p2 + "], length=" + length;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Line)) return false;

        Line other = (Line) obj;
        return Math.abs(this.length - other.length) <= EPSILON;
    }

    @Override
    public int compareTo(Line other) {
        return Double.compare(this.length, other.length);
    }
}