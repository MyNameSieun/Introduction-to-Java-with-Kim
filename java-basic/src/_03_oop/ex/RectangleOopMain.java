package _03_oop.ex;

public class RectangleOopMain {
    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle();
        rectangle.width = 5;
        rectangle.height = 8;

        // 넓이
        rectangle.calculateArea();

        // 둘레
        rectangle.calculatePerimeter();

        // 정사각형 여부
        rectangle.isSquare();
    }
}
