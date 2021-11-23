package com.wight.combined.djview;

/**
 * @author wight
 * @date 2021/11/24
 * @apiNote
 */
public class DJTestDrive {

    public static void main (String[] args) {
        BeatModelInterface model = new BeatModel();
        ControllerInterface controller = new BeatController(model);
    }
}
