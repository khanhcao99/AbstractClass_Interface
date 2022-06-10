package Interface_Comparator;

import java.util.Arrays;
import java.util.Comparator;

public class CircleComparatorTest {
    public static void main(String[] args) {
        Circle[] circle = new Circle[4];
        circle[0] = new Circle(3.4,"Red",true);
        circle[1] = new Circle(3.1,"back",false);
        circle[2] = new Circle(3.2,"while",false);
        circle[3] = new Circle(3.3,"bule",true);

        System.out.println("Ta có mảng: ");
        for (Circle circle1 : circle ){
            System.out.println(circle1);
        }

        Comparator circlecomparator = new CircleComparator();
        Arrays.sort(circle, circlecomparator);

        System.out.println("Hàm sau khí sắp xếp là: ");
        for (Circle circle1: circle){
            System.out.println(circle1);
        }

    }
}
