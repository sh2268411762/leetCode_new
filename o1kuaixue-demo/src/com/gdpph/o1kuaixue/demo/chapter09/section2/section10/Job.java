package com.gdpph.o1kuaixue.demo.chapter09.section2.section10;

/**
 * 成员变量定义
 * @author 零壹学堂
 */
public class Job { // 类定义
    private String jobName; // 工作名称属性定义
    // 成员方法，返回String类型
    public String getJob(String jobName) {
        return "找到工作" + jobName;
    }

    // 成员方法，没有返回值，类型定义为void
    public void findJavaJob() {
        System.out.println("边学习Java边找工作");
    }
}
