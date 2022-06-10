package Interface_Resizeable;

public class Square extends Shape implements Resizeable {
    private double side;

    public Square() {
    }

    public Square(double side, String color, Boolean filled) {
        super(color,filled);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getPerimeter(){
        return side*4;
    }

    public double getArea(){
        return Math.pow(side,2);
    }

    @Override
    public String toString() {
        return "Square{" +
                "side= " + side +
                ", area= " + getArea() +
                ", perimeter= " + getPerimeter() +
                ", which is a subclass of " + super.toString() +
                '}';
    }

    @Override
    public void resize(double percent) {
        side *= percent;
    }
}
