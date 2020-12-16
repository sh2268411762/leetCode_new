package com.gdpph.o1kuaixue.demo.chapter09.section4.section5;

/**
 * 子类调用父类中被重写的方法
 * @author 零壹学堂
 */
public class ChildClass extends ParentClass {
    public String name = "子类名称";
    private String childName; //子类属性

    public String parentMethod() {
        return "子类重写方法";
    }

    public void callParentMethod() {
        System.out.println("调用父类中被重写方法：" + super.parentMethod());
    }

    public static void main(String[] args) {
        ChildClass child = new ChildClass();
        child.callParentMethod();
    }
}
