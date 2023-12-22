package com.shapesproject.seungwon;

public class Main extends Rectangle {  // Rectangle 최종 상속하기
    public Main(int width, int height_1) {  // 기본 생성자
        super(width, height_1);
    }


    public static void main(String[] args) {
        Triangle triangle = new Triangle(3, 3, 7, 5);
        Circle circle = new Circle(5);
        Rectangle rectangle = new Rectangle(4, 6);


        triangle.area();
        triangle.perimeter();

        circle.area();
        circle.perimeter();

        rectangle.area();
        rectangle.perimeter();
    }
}
