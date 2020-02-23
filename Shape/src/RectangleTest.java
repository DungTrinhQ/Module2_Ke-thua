public class RectangleTest {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle();
        System.out.println(rectangle);

        rectangle = new Rectangle(4,5);
        System.out.println(rectangle);

        rectangle = new Rectangle(4,5,"red",false);
        System.out.println(rectangle);
    }
}
