package com.wight.adapter.iterenum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;

/**
 * @author wight
 * @date 2021/11/13
 * @apiNote
 */
public class IteratorEnumerationTestDrive {
    public static void main(String[] args) {
        args = new String[]{"1", "b", "q", "a"};
        ArrayList l = new ArrayList(Arrays.asList(args));
        Enumeration enumeration = new IteratorEnumeration(l.iterator());
        while (enumeration.hasMoreElements()) {
            System.out.print(enumeration.nextElement() + " ");
        }
    }
}
// 为了适配旧代码 Iterator 转为 Enumeration
// ArrayList 的 iterator 返回的是 Iterator 这里用适配器转为 Enumeration