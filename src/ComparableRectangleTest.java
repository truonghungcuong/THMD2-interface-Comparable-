import java.util.Arrays;

public class ComparableRectangleTest {
    public static void main(String[] args) {
        ComparableRectangle[] rectangle=new ComparableRectangle[3];
        rectangle[0]=new ComparableRectangle(3,6);
        rectangle[1]=new ComparableRectangle();
        rectangle[2]=new ComparableRectangle(5,4);
        System.out.println("Pre-sorted:");
        for (ComparableRectangle rectangle1:rectangle){
            System.out.println(rectangle1);
            System.out.println("Area rectangle="+rectangle1.getArea());
            System.out.println("Perimeter rectangle="+rectangle1.getPerimeter());
        }
        Arrays.sort(rectangle);
        System.out.println("\n"+"After-soeted:");
        for (ComparableRectangle rectangle1:rectangle){
            System.out.println(rectangle1);
            System.out.println("Area rectangle="+rectangle1.getArea());
            System.out.println("Perimeter rectangle="+rectangle1.getPerimeter());
        }
    }
}
