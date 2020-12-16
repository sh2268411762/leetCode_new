package com.gdpph.o1kuaixue.demo.chapter12.section2.section6;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * 通过反射处理注解
 *
 * @author 零壹学堂
 */
public class MyAnnotationProcessor {

    public static void main(String[] args) {
        try {
            //加载annotationTest.class类
            Class clazz = MyAnnotationProcessor.class.getClassLoader().loadClass("com.demo.AnnotationTest");

            // 通过反射获取属性
            Field[] fields = clazz.getDeclaredFields();
            // 遍历属性
            for (Field field : fields) {
                CumstomAnnotation myAnnotation = field.getAnnotation(CumstomAnnotation.class);
                System.out.println("name:" + myAnnotation.name() + "  num:" + myAnnotation.num() + "  desc:" + myAnnotation.desc());
            }

            // 通过反射获取类中的方法
            Method[] methods = clazz.getMethods();
            //遍历方法
            for (Method method : methods) {
                if (method.isAnnotationPresent(CumstomAnnotation.class)) {
                    CumstomAnnotation myAnnotation = method.getAnnotation(CumstomAnnotation.class);
                    System.out.println("name:" + myAnnotation.name() + "  num:" + myAnnotation.num() + "  desc:" + myAnnotation.desc());
                }
            }

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
