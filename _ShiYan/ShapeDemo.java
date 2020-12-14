package _ShiYan;

public class ShapeDemo {
    public static void main(String[] args) {
        J_Square square = new J_Square();
        Shape circle = new J_Circle();
        Shape square2 = new J_Square();
        J_Circle circle2 = new J_Circle();
        square.draw();
        square2.draw();
        circle.draw();
        circle2.draw();
    }
}
