package com.gdpph.o1kuaixue.demo.chapter19.section2.section2;

/**
 * User枚举类，用来存储用户密码
 */
public enum UserEnum {
    USER_A("userA", "781e5e245d69b566979b86e28d23f2c7"),
    USER_B("userB", "e388c1c5df4933fa01f6da9f92595589");
    private String name;
    private String password;
    private UserEnum(String name, String password){
        this.name = name;
        this.password = password;
    }
    public String getName() {
        return name;
    }
    public static String getPassword(String name) {
        for (UserEnum user : UserEnum.values()) {
            if (user.getName().equals(name)) {
                return user.password;
            }
        }
        return null;
    }
}
