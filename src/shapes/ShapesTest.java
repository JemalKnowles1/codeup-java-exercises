package shapes;
public class ShapesTest {
    public static void main(String[] args) {
        rectangle box1 = new rectangle(4.0, 5.0);
        System.out.println(box1.getArea());
        System.out.println(box1.getPerimeter());

        rectangle box2 = new Square(5);
        System.out.println(box2.getArea());
        System.out.println(box2.getPerimeter());

    }
}
