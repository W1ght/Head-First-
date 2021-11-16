package com.wight.templatemethod.barista.v1;

/**
 * @author wight
 * @date 2021/11/15
 * @apiNote
 */
public class Tea {
    void prepareRecipe() {
        boilWaster();
        steepTeaBag();
        pourInCup();
        addLemon();
    }

    private void boilWaster() {
        System.out.println("Boiling water");
    }

    private void steepTeaBag() {
        System.out.println("Steeping the tea");
    }

    private void pourInCup() {
        System.out.println("Pouring into cup");
    }

    private void addLemon() {
        System.out.println("Adding Lemon");
    }
}
