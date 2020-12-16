package com.gdpph.o1kuaixue.demo.chapter16.section2.section3;

import java.util.concurrent.*;
/**
 * 实现Callable接口
 * @author 零壹学堂
 */
public class Demo implements Callable<Integer> {
    public static void main(String[] args)
    {
        Demo demo = new Demo();
        FutureTask<Integer> ft = new FutureTask<>(demo);
        for(int i = 0;i < 5;i++) {
            System.out.println(Thread.currentThread().getName()+" 的循环变量i的值"+i);
            if(i==2) {
                new Thread(ft,"有返回值的线程").start();
            }
        }
        try {
            System.out.println("子线程的返回值："+ft.get());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @Override
    public Integer call() throws Exception
    {
        int i = 0;
        for(;i < 5;i++) {
            System.out.println(Thread.currentThread().getName()+" "+i);
        }
        return i;
    }
}
