package com.gdpph.o1kuaixue.demo.chapter09.section4.section4;

/**
 * 子类
 * @author 零壹学堂
 */
public class ChildClass extends ParentClass {
    public String name = "子类名称";
    private String childName; //子类属性

    public String parentMethod() {
        return "子类重写方法";
    }

    public static void main(String[] args) {
        ChildClass child = new ChildClass();
        System.out.println("子类重写父类方法：" + child.parentMethod());
    }
}
