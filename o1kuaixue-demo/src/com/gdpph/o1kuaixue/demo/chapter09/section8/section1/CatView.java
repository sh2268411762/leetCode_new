package com.gdpph.o1kuaixue.demo.chapter09.section8.section1;

/**
 * CatView View视图层
 * @author 零壹学堂
 */
public class CatView {
    public void privateCatInfo(CatModel cat) {
        System.out.println("视图层输出数据：");
        System.out.println("Cat名字为：" + cat.getName() + "，年龄为：" + cat.getAge());
    }
}
