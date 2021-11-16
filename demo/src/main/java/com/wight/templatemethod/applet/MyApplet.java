package com.wight.templatemethod.applet;

import java.applet.Applet;
import java.awt.*;

/**
 * @author wight
 * @date 2021/11/16
 * @apiNote
 */

public class MyApplet extends Applet {
    String message;

    @Override
    public void init() {
        message = "Hello World, I'm alive!";
        repaint();
    }

    @Override
    public void start() {
        message = "Now I'm starting up...";
        repaint();
    }

    @Override
    public void stop() {
        message = "Oh, now I'm being stopped...";
        repaint();
    }

    @Override
    public void destroy() {
        message = "Goodbye, cruel world";
        repaint();
    }

    @Override
    public void paint(Graphics g) {
        g.drawString(message, 5, 15);
    }
}

