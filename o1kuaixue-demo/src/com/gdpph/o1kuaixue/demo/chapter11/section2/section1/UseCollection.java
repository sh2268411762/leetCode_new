package com.gdpph.o1kuaixue.demo.chapter11.section2.section1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * 集合类Collection中iterator()方法的使用
 * @author 零壹学堂
 */
public class UseCollection {
    public static void main(String[] args) {
        Collection<String> collection = new ArrayList<String>();
        collection.add("第一个元素");
        collection.add("第二个元素");
        Iterator iterator = collection.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
