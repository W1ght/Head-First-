package com.wight.iterator.v2;

import java.util.Hashtable;
import java.util.Iterator;

/**
 * @author wight
 * @date 2021/11/16
 * @apiNote
 */
public class CafeMenu implements Menu{
    Hashtable<String, MenuItem> menuItems = new Hashtable<>();

    public CafeMenu() {

    }

    public void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        menuItems.put(menuItem.getName(), menuItem);
    }

    @Override
    public Iterator<MenuItem> createIterator() {
        return menuItems.values().iterator();
    }
}
