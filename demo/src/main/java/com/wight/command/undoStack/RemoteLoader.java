package com.wight.command.undoStack;

import java.util.LinkedList;

/**
 * @author wight
 * @date 2021/11/13
 * @apiNote
 */
public class RemoteLoader {
    public static void main(String[] args) {
        RemoteControlWithUndo remoteControl = new RemoteControlWithUndo();

        CeilingFan ceilingFan = new CeilingFan("Living Room");

        LinkedList<Integer> stack = new LinkedList<Integer>();

        CeilingFanLowCommand ceilingFanLow =
                new CeilingFanLowCommand(ceilingFan, stack);
        CeilingFanMediumCommand ceilingFanMedium =
                new CeilingFanMediumCommand(ceilingFan, stack);
        CeilingFanHighCommand ceilingFanHigh =
                new CeilingFanHighCommand(ceilingFan, stack);
        CeilingFanOffCommand ceilingFanOff =
                new CeilingFanOffCommand(ceilingFan, stack);

        remoteControl.setCommand(0, ceilingFanMedium, ceilingFanOff);
        remoteControl.setCommand(1, ceilingFanHigh, ceilingFanOff);
        remoteControl.setCommand(2, ceilingFanLow, ceilingFanOff);

        System.out.println(remoteControl);
        remoteControl.onButtonWasPushed(0);
        remoteControl.offButtonWasPushed(0);
        remoteControl.onButtonWasPushed(1);
        remoteControl.onButtonWasPushed(2);
        remoteControl.undoButtonWasPushed();
        remoteControl.undoButtonWasPushed();
        remoteControl.undoButtonWasPushed();

    }
}
