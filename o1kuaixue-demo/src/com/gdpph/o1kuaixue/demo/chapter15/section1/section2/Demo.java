package com.gdpph.o1kuaixue.demo.chapter15.section1.section2;

import java.util.ArrayList;
import java.util.List;

/**
 * Error示例
 *
 * @author 零壹学堂
 */
public class Demo {
    public static void main(String args[]){
        List<User> users = new ArrayList<>(2);
        for(int i=0; i<2; i++){
            try{
            users.add(new User(String.valueOf(i))); //will throw NoClassDefFoundError
            }catch(Throwable t){
                t.printStackTrace();
            }
        }
    }
}
