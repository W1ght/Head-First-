package com.wight.proxy.gumball;

/**
 * @author wight
 * @date 2021/11/20
 * @apiNote
 */
public class GumballMachineTestDrive {
    public static void main(String[] args) {
        int count = 0;

        args = new String[]{"Seattle", "112"};

        if (args.length < 2) {
            System.out.println("GumballMachine <name> <inventory>");
            System.exit(1);
        }

        count = Integer.parseInt(args[1]);
        GumballMachine gumballMachine = new GumballMachine(args[0], count);

        GumballMonitor monitor = new GumballMonitor(gumballMachine);

        monitor.report();
    }
}
