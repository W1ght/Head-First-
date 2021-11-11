package com.wight.decorator.starbuzz;

public abstract class Beverage {
    String description = "Unknown Beverage";
    static final int TALL = 0;
    static final int GRANDE = 1;
    static final int VENTI = 2;
    int size = 1;

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
