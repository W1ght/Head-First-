package com.wight.adapter.iterenum;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Vector;

/**
 * @author wight
 * @date 2021/11/13
 * @apiNote
 */
public class EnumerationIteratorTestDrive {
    public static void main (String[] args) {
        args = new String[]{"1", "b", "q", "a"};
        Vector v = new Vector(Arrays.asList(args));
        Iterator iterator = new EnumerationIterator(v.elements());
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
    }
}
// Vector 的 element 返回的是 Enumeration 这里用适配器转为 Iterator