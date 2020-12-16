package com.gdpph.o1kuaixue.demo.chapter15.section4.section1;

/**
 * 自定义异常示例
 * @author 零壹学堂
 */
public class Demo {
    public static void main(String[] args) throws DefineException {
        String earth = "地球是方的";
        if(earth.equals("地球是方的")) {
            throw new DefineException("逻辑错误：" + earth);
        }
    }
}
