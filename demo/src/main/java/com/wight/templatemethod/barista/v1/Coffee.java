package com.wight.templatemethod.barista.v1;

/**
 * @author wight
 * @date 2021/11/15
 * @apiNote
 */
public class Coffee {
    void prepareRecipe() {
        boilWaster();
        brewCoffeeGrinds();
        pourInCup();
        addSugarAndMilk();
    }

    private void boilWaster() {
        System.out.println("Boiling water");
    }

    private void brewCoffeeGrinds() {
        System.out.println("Dripping Coffee through filter");
    }

    private void pourInCup() {
        System.out.println("Pouring into cup");
    }

    private void addSugarAndMilk() {
        System.out.println("Adding Sugar and Milk");
    }

}
