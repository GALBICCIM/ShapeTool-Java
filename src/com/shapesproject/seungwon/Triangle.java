package com.shapesproject.seungwon;

public class Triangle implements ShapeCalculator {  // ShapeCalculator 인터페이스 불러오기
    int width_1;  // 삼각형 변 1
    int width_2;  // 삼각형 변 2
    int baseLine;  // 삼각형 밑변
    int height_1;  // 삼각형 높이

    public Triangle(int width_1, int width_2, int baseLine, int height_1) {  // Main 클래스에서 인자값을 받는 함수
        this.width_1 = width_1;
        this.width_2 = width_2;
        this.baseLine = baseLine;
        this.height_1 = height_1;
    }

    public Triangle() {  // 기본 생성자
    }


    // 인터페이스에서 오버라이딩
    @Override
    public void area() {
        System.out.println("삼각형의 넓이: " + (float) this.baseLine * this.height_1 / 2);
    }


    @Override
    public void perimeter() {
        System.out.println("삼각형의 둘레: " + (this.width_1 + this.width_2 + this.baseLine));
    }
}
