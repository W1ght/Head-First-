package com.wight.command.remote;

/**
 * @author wight
 * @date 2021/11/13
 * @apiNote
 */
public class GarageDoor {
    String location = "";

    public GarageDoor(String location) {
        this.location = location;
    }

    public GarageDoor() {

    }

    public void up() {
        System.out.println(location + " GarageDoor is up");
    }

    public void down() {
        System.out.println(location + " GarageDoor is down");
    }

    public void lightOff() {
        System.out.println(location + " GarageDoor is lightOff");
    }

    public void lightOn() {
        System.out.println(location + " GarageDoor is lightOn");
    }

    public void stop() {
        System.out.println(location + " GarageDoor is stop");
    }
}
