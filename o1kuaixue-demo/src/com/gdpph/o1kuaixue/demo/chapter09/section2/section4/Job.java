package com.gdpph.o1kuaixue.demo.chapter09.section2.section4;

/**
 * Job内部类定义
 * @author 零壹学堂
 */
public class Job {
    // 内部类——JobSalary
    public class JobSalary {
        private double salary;
    }
    // 成员属性
    private String jobName;
    // 成员方法
    public String getJob() {
        return "找到工作";
    }
}
