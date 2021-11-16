package com.wight.templatemethod.barista.v2;

/**
 * @author wight
 * @date 2021/11/16
 * @apiNote
 */
public class BeverageTestDriver {
    public static void main(String[] args) {
        CaffeineBeverageWithHook teaHook = new TeaWithHook();
        CaffeineBeverageWithHook coffeeHook = new CoffeeWithHook();

        System.out.println("\nMaking tea...");
        teaHook.prepareRecipe();

        System.out.println("\nMaking coffee...");
        coffeeHook.prepareRecipe();
    }
}
