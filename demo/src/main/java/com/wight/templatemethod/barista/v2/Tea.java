package com.wight.templatemethod.barista.v2;

/**
 * @author wight
 * @date 2021/11/16
 * @apiNote
 */
public class Tea extends CaffeineBeverage{
    @Override
    void brew() {
        System.out.println("Dripping Coffee through filter");
    }

    @Override
    void addCondiments() {
        System.out.println("Adding Sugar and Milk");
    }
}
