package com.wight.composite.menuiterator;

import java.util.Iterator;

/**
 * @author wight
 * @date 2021/11/17
 * @apiNote
 */
public class NullIterator implements Iterator<MenuComponent> {
    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public MenuComponent next() {
        return null;
    }
}
