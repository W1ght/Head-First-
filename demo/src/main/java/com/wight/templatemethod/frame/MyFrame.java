package com.wight.templatemethod.frame;

import javax.swing.*;
import java.awt.*;

/**
 * @author wight
 * @date 2021/11/16
 * @apiNote
 */
public class MyFrame extends JFrame {

    public MyFrame(String title) {
        super(title);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.setSize(300,300);
        this.setVisible(true);
    }

    @Override
    public void paint(Graphics graphics) {
        super.paint(graphics);
        String msg = "holy shit!!";
        graphics.drawString(msg, 100, 100);
    }

    public static void main(String[] args) {
        MyFrame myFrame = new MyFrame("oh my gosh");
    }
}
