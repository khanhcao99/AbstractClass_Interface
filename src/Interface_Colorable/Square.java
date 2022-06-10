package Interface_Colorable;

public class Square extends Shape implements Colorable {
    private double side;

    public Square() {
    }

    public Square(double side, String color, boolean filled) {
        super(color,filled);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getArea(){
        return Math.pow(side,2);
    }

    @Override
    public String toString() {
        return "Square{" +
                " side=" + side +
                " area= " + getArea() +
                " " +
                super.toString() +
                '}';
    }

    @Override
    public void howToColor() {
        System.out.println("Hình vuông tô bốn cạnh");
    }


}
