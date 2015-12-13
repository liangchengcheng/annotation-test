package com.example;

import com.libs.FruitColor;
import com.libs.FruitName;
import com.libs.FruitProvider;

import java.lang.reflect.Field;

/**
 * Author:  梁铖城
 * Email:   1038127753@qq.com
 * Date:    2015年12月13日22:57:01
 * Description:  注解处理器
 */
public class FruitInfoUtil {

    public static void getFruitInfo(Class<?> cls){

        String strFruitName="水果名称";
        String strFruitColor="水果颜色";
        String strFruitProvicer="水果供应商";

        Field[] fields = cls.getDeclaredFields();

        for (Field field:fields){
            if(field.isAnnotationPresent(FruitName.class)){
                FruitName fruitName = (FruitName) field.getAnnotation(FruitName.class);
                strFruitName=strFruitName+fruitName.value();
                System.out.println(strFruitName);
            }
            else if(field.isAnnotationPresent(FruitColor.class)){
                FruitColor fruitColor= (FruitColor) field.getAnnotation(FruitColor.class);
                strFruitColor=strFruitColor+fruitColor.fruitColor().toString();
                System.out.println(strFruitColor);
            }
            else if(field.isAnnotationPresent(FruitProvider.class)){
                FruitProvider fruitProvider= (FruitProvider) field.getAnnotation(FruitProvider.class);
                strFruitProvicer=" 供应商编号："+fruitProvider.id()+" 供应商名称："+fruitProvider.name()+" 供应商地址："+fruitProvider.address();
                System.out.println(strFruitProvicer);
            }
        }
    }

}
