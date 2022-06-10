package Interface_Colorable;

public class testColorable {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(3.0, "red", true);
        shapes[1] = new Square(4.0, "black", false);
        shapes[2] = new Square(5.0, "bule", false);

        System.out.println("Mảng có: ");
        for (Shape shape : shapes) {
            System.out.println(shape);
        }
        for (Shape x : shapes) {
            if (x instanceof Colorable) {
                ((Colorable) x).howToColor();
            }
        }

    }
}
