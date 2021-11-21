package com.wight.proxy.gumballremote;

import java.rmi.Naming;

/**
 * @author wight
 * @date 2021/11/21
 * @apiNote
 */
public class GumballMachineTestDrive {
    public static void main(String[] args) {
        GumballMachine gumballMachine = null;
        int count;
        if (args.length < 2) {
            System.out.println("GumballMachine <name> <inventory>");
            System.exit(1);
        }

        try {
            count = Integer.parseInt(args[1]);
            gumballMachine = new GumballMachine(args[0], count);
            Naming.rebind( args[0] + "/gumballmachine", gumballMachine);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
