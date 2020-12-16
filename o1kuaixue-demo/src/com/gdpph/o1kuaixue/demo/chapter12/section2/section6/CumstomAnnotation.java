package com.gdpph.o1kuaixue.demo.chapter12.section2.section6;

import java.lang.annotation.*;

/**
 * @author 零壹学堂
 */
@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Inherited
@Documented
public @interface CumstomAnnotation {

  int num() default 10;

  String name() default "Jack";

  String desc() default "My name is Jack";
}
