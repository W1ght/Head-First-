package com.wight.adapter.iterenum;

import java.util.*;

/**
 * @author wight
 * @date 2021/11/13
 * @apiNote
 */
public class EI {
    public static void main (String[] args) {
        args = new String[]{"1", "b", "q", "a"};
        Vector v = new Vector(Arrays.asList(args));
        Enumeration enumeration = v.elements();
        while (enumeration.hasMoreElements()) {
            System.out.print(enumeration.nextElement() + " ");
        }
        System.out.println("");
        Iterator iterator = v.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
    }
}
