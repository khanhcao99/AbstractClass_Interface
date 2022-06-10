package Interface_Resizeable;

public class TestResizeble {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(3.4, "Red", true);
        shapes[1] = new Rectangle(4.5, 3.5, "Black", false);
        shapes[2] = new Square(3.4, "blue", true);

        System.out.println("Mảng trước khi ramdom: ");
        for (Shape shape : shapes) {
            System.out.println(shape);
        }

        System.out.println("________________________________________");

        System.out.println("Mảng sau khi ramdom: ");
        for (Shape shape1 : shapes){
            shape1.resize(Math.random()*100);
            System.out.println(shape1);
        }

    }
}
