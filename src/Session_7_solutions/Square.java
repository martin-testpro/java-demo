package Session_7_solutions;

public class Square {

    String color;
    double side_length;

    public Square(String col, double length) {
        color = col;
        side_length = length;
    }

    public double get_perimeter() {
        return 4*side_length;
    }
}
