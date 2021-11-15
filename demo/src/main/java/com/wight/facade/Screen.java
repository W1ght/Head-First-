package com.wight.facade;

/**
 * @author wight
 * @date 2021/11/15
 * @apiNote
 */
public class Screen {
    String description;

    public Screen(String description) {
        this.description = description;
    }

    public void up() {
        System.out.println(description + " going up");
    }

    public void down() {
        System.out.println(description + " going down");
    }


    @Override
    public String toString() {
        return description;
    }
}
