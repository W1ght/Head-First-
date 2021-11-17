package com.wight.composite.menuiterator;

import java.util.Iterator;
import java.util.Stack;

/**
 * @author wight
 * @date 2021/11/17
 * @apiNote
 */
public class CompositeIterator implements Iterator<MenuComponent> {
    Stack<Iterator<MenuComponent>> stack = new Stack<>();

    public CompositeIterator(Iterator<MenuComponent> iterator) {
        stack.push(iterator);
    }

    @Override
    public MenuComponent next() {
        if (hasNext()) {
            Iterator<MenuComponent> iterator = stack.peek();
            MenuComponent component = iterator.next();
            // 是个菜单就把迭代器加入栈
            if (component instanceof Menu) {
                stack.push(component.createIterator());
            }
            return component;
        } else {
            return null;
        }
    }

    @Override
    public boolean hasNext() {
        if (stack.empty()) {
            return false;
        } else {
            Iterator<MenuComponent> iterator = stack.peek();
            // 当前迭代器已经迭代完成
            if (!iterator.hasNext()) {
                stack.pop();
            // 出栈后看看之前的迭代器是否还有下一个元素
                return hasNext();
            // 还有元素要迭代
            } else {
                return true;
            }
        }
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }
}
