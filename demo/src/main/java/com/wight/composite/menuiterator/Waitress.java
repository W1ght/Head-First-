package com.wight.composite.menuiterator;


import java.util.Iterator;

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

    public void printVegetarianMenu() {
        Iterator<MenuComponent> iterator = allMenus.createIterator();
        System.out.println("\nVEGETARIAN MENU\n----");
        while (iterator.hasNext()) {
            MenuComponent menuComponent = iterator.next();
            try {
                // 判断素食，菜单会抛异常，捕获了就能正常的遍历菜单项
                // 虽说可以 instanceof 进行运行时的类型检查，但是这样就会失去菜单和菜单项的透明性，我们只需要关注他们的接口就行
                // 或者可以选择让菜单的 isVegetarian() 返回 false，这样也能保证程序的透明性
                if (menuComponent.isVegetarian()) {
                    menuComponent.print();
                }
            } catch (UnsupportedOperationException e) { }
            // 只能调用菜单项的 print()，不能调用菜单的 print()。因为这里是靠迭代器实现的，如果调用菜单的 print() 会重复打印
        }
    }
}
