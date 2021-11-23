package com.wight.combined.djview;

/**
 * @author wight
 * @date 2021/11/23
 * @apiNote
 */
public interface BeatModelInterface {
    /**
     * initialize
     */
    void initialize();

    /**
     * on
     */
    void on();

    /**
     * off
     */
    void off();

    /**
     * setBPM
     */
    void setBPM(int bpm);

    /**
     * getBPM
     */
    int getBPM();

    /**
     * registerObserver
     */
    void registerObserver(BeatObserver o);

    /**
     * removeObserver
     */
    void removeObserver(BeatObserver o);

    /**
     * registerObserver
     */
    void registerObserver(BPMObserver o);

    /**
     * removeObserver
     */
    void removeObserver(BPMObserver o);
}
