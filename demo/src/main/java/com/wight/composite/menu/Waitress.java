package com.wight.composite.menu;

/**
 * @author wight
 * @date 2021/11/17
 * @apiNote
 */
public class Waitress {
    MenuComponent allMenus;

    public Waitress(MenuComponent allMenus) {
        this.allMenus = allMenus;
    }

    public void printMenu() {
        allMenus.print();
    }
}
