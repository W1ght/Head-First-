package com.wight.command.remote;

/**
 * @author wight
 * @date 2021/11/13
 * @apiNote
 */
public class Stereo {
    String location = "";

    public Stereo(String location) {
        this.location = location;
    }

    public Stereo() {

    }

    public void on() {
        System.out.println(location + " Stereo is on");
    }

    public void off() {
        System.out.println(location + " Stereo is off");
    }

    public void setCd() {
        System.out.println(location + " cd is set");
    }

    public void setDvd() {
        System.out.println(location + " dvd is set");
    }

    public void setRadio() {
        System.out.println(location + " Radio is set");
    }

    public void setVolume(int volume) {
        System.out.println(location + " volume is " +volume );
    }
}
