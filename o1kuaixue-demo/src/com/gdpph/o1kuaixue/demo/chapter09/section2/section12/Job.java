package com.gdpph.o1kuaixue.demo.chapter09.section2.section12;

/**
 * 成员变量定——return关键字使用
 * @author 零壹学堂
 */
public class Job { // 类定义
    private String jobName; // 工作名称属性定义
    // 成员方法，没有返回值，类型定义为void

    public void findJavaJob() {
        if(jobName.equals("Java")) {
            System.out.println("边学习Java边找工作");
            return;
        }
        System.out.println("这条语句不会被执行");
    }
}
