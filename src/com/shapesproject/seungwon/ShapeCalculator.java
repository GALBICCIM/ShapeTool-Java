package com.shapesproject.seungwon;

public interface ShapeCalculator {  // 기본 인터페이스
    public static final String shape = "도형";  // 의미 없는 코드


    public abstract void area();  // 각 클래스에서 사용할 넓이 구하는 추상 메소드
    public abstract void perimeter();  // 각 클래스에서 사용할 둘레 구하는 추상 메소드
}
