package com.gdpph.o1kuaixue.demo.chapter09.section8.section1;

/**
 * MVC设计模式示例
 * @author 零壹学堂
 */
public class MVCDemo {
    public static void main(String[] args) {
        CatModel cat = getCatFromDB(); // 初始化数据模型
        CatView view = new CatView(); // 创建视图
        CatController controller = new CatController(cat, view);//初始化Controller
        controller.updateView();
        cat.setName("小黑");
        controller.updateView();
    }
    // 模拟从数据库获取Cat数据
    private static CatModel getCatFromDB() {
        CatModel cat = new CatModel();
        cat.setName("大白");
        cat.setAge(1);
        return cat;
    }
}
