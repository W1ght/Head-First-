package com.wight.iterator.v2;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author wight
 * @date 2021/11/16
 * @apiNote
 */
public class PancakeHouseMenu implements Menu {
    ArrayList<MenuItem> menuItems;

    public PancakeHouseMenu() {
        menuItems = new ArrayList<>();

        addItem("K&B Pancake Breakfast",
                "Pancake with scrambled eggs, and toast",
                true,
                2.99);
        addItem("Regular Pancake Breakfast",
                "Pancake with fried eggs, sausage",
                false,
                2.99);
        addItem("Blueberry Pancakes",
                "Pancake with fresh blueberries",
                true,
                3.49);
        addItem("Waffles",
                "Waffles, with your choice of blueberries or strawberries",
                true,
                3.59);
    }

    public void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        menuItems.add(menuItem);
    }

    @Override
    public Iterator<MenuItem> createIterator() {
        return menuItems.iterator();
    }
}
