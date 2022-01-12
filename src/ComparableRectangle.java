public class ComparableRectangle extends Rectangle implements Comparable<ComparableRectangle> {
    public ComparableRectangle() {
    }

    public ComparableRectangle(double width, double length) {
        super(width, length);
    }

    public ComparableRectangle(String color, boolean filled, double width, double length) {
        super(color, filled, width, length);
    }

    @Override
    public int compareTo(ComparableRectangle o) {
        if (getArea() > o.getArea() || getPerimeter() > o.getPerimeter()) {
            return 1;
        } else if (getArea() < o.getArea() || getPerimeter() < o.getPerimeter()) {
            return -1;
        } else {
            return 0;
        }
    }
}
