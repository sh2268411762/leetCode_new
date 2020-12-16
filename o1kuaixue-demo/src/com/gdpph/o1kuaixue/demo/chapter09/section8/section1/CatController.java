package com.gdpph.o1kuaixue.demo.chapter09.section8.section1;

/**
 * CatController控制器
 * @author 零壹学堂
 */
public class CatController {
    private CatModel cat;
    private CatView view;
    public CatController(CatModel cat, CatView view) {
        this.cat = cat;
        this.view = view;
    }
    public void setCat(CatModel cat) {
        this.cat = cat;
    }
    public CatModel getCat() {
        return cat;
    }
    public void setView(CatView view) {
        this.view = view;
    }
    public CatView getView() {
        return view;
    }
    // 更新视图
    public void updateView() {
        view.privateCatInfo(cat);
    }
}
