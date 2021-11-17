package com.wight.iterator.v2;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author wight
 * @date 2021/11/17
 * @apiNote
 */
public class WaitressV2 {
    ArrayList<Menu> menus;

    public WaitressV2(ArrayList<Menu> menus) {
        this.menus = menus;
    }

    public void printMenu() {
        Iterator<Menu> menuItemIterator = menus.iterator();
        while (menuItemIterator.hasNext()) {
            Menu menu = menuItemIterator.next();
            printMenu(menu.createIterator());
        }
    }

    void printMenu(Iterator<MenuItem> iterator) {
        while (iterator.hasNext()) {
            MenuItem menuItem = iterator.next();
            System.out.print(menuItem.getName() + ", ");
            System.out.print(menuItem.getPrice() + " -- ");
            System.out.println(menuItem.getDescription());
        }
    }
}
