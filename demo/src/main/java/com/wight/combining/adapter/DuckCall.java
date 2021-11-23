package com.wight.combining.adapter;

/**
 * @author wight
 * @date 2021/11/22
 * @apiNote
 */
public class DuckCall implements Quackable{
    @Override
    public void quack() {
        System.out.println("Kwak");
    }
}
