package com.gdpph.o1kuaixue.demo.chapter09.section5.section8;

/**
 * CatAction类
 *
 * @author 零壹学堂
 */
public class CatAction  implements Cloneable {
    private String eat;
    /**
     * @param eat the eat to set
     */
    public void setEat(String eat) {
        this.eat = eat;
    }
    /**
     * @return the eat
     */
    public String getEat() {
        return eat;
    }
    @Override
    public String toString() {
        return "CatAction：【" + eat + "】";
    }
    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
}
