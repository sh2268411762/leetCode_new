package com.gdpph.o1kuaixue.demo.chapter09.section2.section7;

/**
 * 创建对象——引用
 * @author 零壹学堂
 */
public class JobReference {
    public static void main(String[] args) {
        Job job1 = new Job();
        Job job2 = job1;
        Job job3 = new Job();
        System.out.println("job1和job2是相等的:" + job1.equals(job2));
        System.out.println("job3和job1是相等的" + job3.equals(job1));
    }
}
