package com.wight.templatemethod.sort;

/**
 * @author wight
 * @date 2021/11/16
 * @apiNote
 */
public class Duck implements Comparable{
    String name;
    int weight;

    public Duck(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return name + " weighs " + weight;
    }

    @Override
    public int compareTo(Object object) {
        Duck otherDuck = (Duck) object;

        return Integer.compare(this.weight, otherDuck.weight);
    }
}
