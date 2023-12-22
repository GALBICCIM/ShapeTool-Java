package com.shapesproject.seungwon;

public class Circle extends Triangle {  // Triangle 상속하기
    int radius;  // 반지름
    final double PI = 3.14;  // 임의의 파이값

    public Circle(int radius) {  // Main 클래스에서 인자값을 받는 함수
        this.radius = radius;
    }

    public Circle() {  // 기본 생성자
    }


    // 인터페이스에서 오버라이딩
    @Override
    public void area(){
        System.out.println("원의 넓이: " + (Math.pow(this.radius, 2) * PI));
    }


    @Override
    public void perimeter() {
        System.out.println("원의 둘레: " + (2 * this.radius * PI));
    }
}
