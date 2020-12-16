package com.gdpph.o1kuaixue.demo.chapter12.section2.section5;

/**
 * @author 零壹学堂
 */
public class AnnotationTest {

    @CumstomAnnotation(name = "Mike", desc = "My name is Mike")
    public void test1() {
        System.out.println("test1");
    }

    @CumstomAnnotation
    public void test2() {
        System.out.println("test2");
    }
}
