package com.wight.proxy.gumball;

/**
 * @author wight
 * @date 2021/11/19
 * @apiNote
 */
public class GumballMonitor {
    GumballMachine machine;

    public GumballMonitor(GumballMachine machine) {
        this.machine = machine;
    }

    public void report() {
        System.out.println("Gumball Machine: " + machine.getLocation());
        System.out.println("Current inventory: " + machine.getCount() + " gumballs");
        System.out.println();
    }
}
