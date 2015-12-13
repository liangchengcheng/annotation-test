package com.libs;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Author:  梁铖城
 * Email:   1038127753@qq.com
 * Date:    2015年12月13日22:47:20
 * Description:  水果的供应商
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Deprecated
public @interface FruitProvider {


    /**
     * 供应商的编号
     */
    public int id() default -1;

    /**
     * 供应商的名称
     */
    public String name() default "";

    /**
     * 供应商的地址
     */

    public String address() default "";
}
