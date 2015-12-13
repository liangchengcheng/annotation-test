package com.example;

import com.libs.FruitColor;
import com.libs.FruitName;
import com.libs.FruitProvider;

/**
 * Author:  梁铖城
 * Email:   1038127753@qq.com
 * Date:    2015年12月13日22:45:00
 * Description:http://www.cnblogs.com/peida/archive/2013/04/24/3036689.html
 */
public class Apple {

    @FruitName("苹果")
    private String appleName;

    @FruitColor(fruitColor = FruitColor.Color.RED)
    private String appleColor;

    @FruitProvider(id = 1,name = "烟台apple",address = "创业大街")
    private String appleProvider;

    public void setAppleColor(String appleColor) {
        this.appleColor = appleColor;
    }
    public String getAppleColor() {
        return appleColor;
    }

    public void setAppleName(String appleName) {
        this.appleName = appleName;
    }
    public String getAppleName() {
        return appleName;
    }

    public void setAppleProvider(String appleProvider) {
        this.appleProvider = appleProvider;
    }
    public String getAppleProvider() {
        return appleProvider;
    }

    public void displayName(){
        System.out.println("水果的名字是：苹果");
    }
}
