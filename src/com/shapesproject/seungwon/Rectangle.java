package com.shapesproject.seungwon;

public class Rectangle extends Circle {  // Circle 상속하기
    int width;  // 사각형 변
    int height;  // 사각형 높이

    public Rectangle(int width, int height) {  // Main 클래스에서 인자값을 받는 함수
        this.width = width;
        this.height = height_1;
    }


    // 인터페이스 오버라이딩
    @Override
    public void area() {
        System.out.println("사각형의 넓이: " + (width * height));
    }


    @Override
    public void perimeter() {
        System.out.println("사각형의 둘레: " + (2 * (width + height)));
    }
}
