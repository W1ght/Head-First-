package com.wight.templatemethod.barista.v2;

/**
 * @author wight
 * @date 2021/11/16
 * @apiNote
 */
public class Coffee extends CaffeineBeverage{
    @Override
    void brew() {
        System.out.println("Steeping the tea");
    }

    @Override
    void addCondiments() {
        System.out.println("Adding Lemon");
    }
}
