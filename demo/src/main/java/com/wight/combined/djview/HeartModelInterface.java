package com.wight.combined.djview;

/**
 * @author wight
 * @date 2021/11/24
 * @apiNote
 */
public interface HeartModelInterface {
    /**
     * getHeartRate
     *
     * @return HeartRate
     */
    int getHeartRate();

    /**
     * registerObserver
     *
     * @param o BeatObserver
     */
    void registerObserver(BeatObserver o);

    /**
     * removeObserver
     *
     * @param o BeatObserver
     */
    void removeObserver(BeatObserver o);

    /**
     * registerObserver
     *
     * @param o BeatObserver
     */
    void registerObserver(BPMObserver o);

    /**
     * removeObserver
     *
     * @param o BeatObserver
     */
    void removeObserver(BPMObserver o);
}
