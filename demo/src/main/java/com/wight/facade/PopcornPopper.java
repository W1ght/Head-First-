package com.wight.facade;

/**
 * @author wight
 * @date 2021/11/15
 * @apiNote
 */
public class PopcornPopper {
    String description;

    public PopcornPopper(String description) {
        this.description = description;
    }

    public void on() {
        System.out.println(description + " on");
    }

    public void off() {
        System.out.println(description + " off");
    }

    public void pop() {
        System.out.println(description + " popping popcorn!");
    }


    @Override
    public String toString() {
        return description;
    }
}
