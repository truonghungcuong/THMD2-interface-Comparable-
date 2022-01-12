import java.util.Arrays;

public class ComparableCircleTest {
    public static void main(String[] args) {
        ComparableCircle[] circles = new ComparableCircle[3];
        circles[0] = new ComparableCircle(3.6);
        circles[1] = new ComparableCircle();
        circles[2] = new ComparableCircle("indigo", false, 3.5);
        System.out.println("Pre-sorted:");
        for (ComparableCircle circle:circles){
            System.out.println(circle);
            System.out.println("Area circle="+circle.getArea());
            System.out.println("Perimeter circle="+circle.getPerimeter());
        }

        Arrays.sort(circles);
        System.out.println("\n"+"After-soeted:");
        for (ComparableCircle circle:circles){
            System.out.println(circle);
            System.out.println("Area circle="+circle.getArea());
            System.out.println("Perimeter circle="+circle.getPerimeter());
        }
    }
}
