package com.wight.proxy.javaproxy;

/**
 * @author wight
 * @date 2021/11/22
 * @apiNote
 */
public interface PersonBean {
    /**
     * getName
     * @return  name
     */
    String getName();

    /**
     * getGender
     * @return  gender
     */
    String getGender();

    /**
     * getInterest
     * @return  interest
     */
    String getInterest();

    /**
     * getHotOrNotRating
     * @return  HotOrNotRating
     */
    int getHotOrNotRating();

    /**
     * setName
     * @param name  name
     */
    void setName(String name);

    /**
     * setGender
     * @param gender gender
     */
    void setGender(String gender);

    /**
     * setInterest
     * @param interests interests
     */
    void setInterests(String interests);

    /**
     * setHotOrNotRating
     * @param rating rating
     */
    void setHotOrNotRating(int rating);

}
