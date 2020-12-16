package com.gdpph.o1kuaixue.demo.chapter05.section1.section15;

/**
 * Person枚举类,定义了“小王”、“小张”和“小刘”三个枚举值
 * @author 零壹学堂
 */
public enum PersonEnum {
    XIAO_WANG("小王"),
    XIAO_ZHANG("小张"),
    XIAO_LIU("小刘");

    private String name;

    PersonEnum(String name) {
        this.name = name;
    }

    public static PersonEnum getPersonName(String name) {
        for (PersonEnum personEnum : PersonEnum.values()) {
            if(personEnum.getName().equals(name)) {
                return personEnum;
            }
        }
        return null;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }
}
