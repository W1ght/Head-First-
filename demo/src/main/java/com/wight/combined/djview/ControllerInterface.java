package com.wight.combined.djview;

/**
 * @author wight
 * @date 2021/11/23
 * @apiNote
 */
public interface ControllerInterface {
    /**
     * start
     */
    void start();

    /**
     * stop
     */
    void stop();

    /**
     * increaseBPM
     */
    void increaseBPM();

    /**
     * decreaseBPM
     */
    void decreaseBPM();

    /**
     * setBPM
     * @param bpm bpm
     */
    void setBPM(int bpm);
}
