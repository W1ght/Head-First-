package com.wight.iterator.v2;

import java.util.Iterator;

/**
 * @author wight
 * @date 2021/11/16
 * @apiNote
 */
public interface Menu {
    /**
     * 返回迭代器
     *
     * @return 迭代器
     */
    public Iterator<MenuItem> createIterator();
}
