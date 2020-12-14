package _ShiYan;

public abstract class Shape {
    abstract void draw();
    //抽象方法没有方法体
}

class J_Circle extends Shape {
    @Override
    void draw() {
        System.out.println("J_Circle draw");
    }
}

class J_Square extends Shape {
    @Override
    void draw() {
        System.out.println("J_Square draw");
    }
}
