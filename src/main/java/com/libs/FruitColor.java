package com.libs;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Author:  梁铖城
 * Email:   1038127753@qq.com
 * Date:  2015年12月13日22:42:11
 * Description:  水果颜色的注解
 */

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Deprecated()
public @interface FruitColor {

    /**
     *颜色的枚举
     */
    public enum  Color{BLUE,RED,GREEN};

    /**
     * 颜色属性
     */
    Color fruitColor() default Color.RED;
}
