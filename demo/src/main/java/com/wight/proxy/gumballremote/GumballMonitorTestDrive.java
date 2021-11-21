package com.wight.proxy.gumballremote;

import java.rmi.Naming;

/**
 * @author wight
 * @date 2021/11/21
 * @apiNote
 */
public class GumballMonitorTestDrive {

    public static void main(String[] args) {
        String[] location = {"rmi://127.0.0.1/santafe.mightygumball.com/gumballmachine",
                "rmi://127.0.0.1/boulder.mightygumball.com/gumballmachine",
                "rmi://127.0.0.1/seattle.mightygumball.com/gumballmachine"};

        GumballMonitor[] monitor = new GumballMonitor[location.length];

        for (int i = 0; i < location.length; i++) {
            try {
                GumballMachineRemote machine =
                        (GumballMachineRemote) Naming.lookup(location[i]);
                monitor[i] = new GumballMonitor(machine);
                System.out.println(monitor[i]);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        for (GumballMonitor gumballMonitor : monitor) {
            try {
                gumballMonitor.report();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }
}
