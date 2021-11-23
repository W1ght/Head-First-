package com.wight.combined.djview;

/**
 * @author wight
 * @date 2021/11/24
 * @apiNote
 */
public class HeartTestDrive {

    public static void main (String[] args) {
        HeartModel heartModel = new HeartModel();
        ControllerInterface model = new HeartController(heartModel);
    }
}
