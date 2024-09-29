package _03_oop.ex;

public class Rectangle {
    int width;
    int height;

    // 넓이
    void calculateArea() {
        int area = width * height;
        System.out.println("넓이: " + area);
    }

    // 둘레
    void calculatePerimeter() {
        int perimeter = 2 * (width + height);
        System.out.println("둘레 길이: " + perimeter);
    }

    // 정사각형 여부
    void isSquare() {
        boolean square = width == height;
        System.out.println("정사각형 여부: " + square);
    }
}
