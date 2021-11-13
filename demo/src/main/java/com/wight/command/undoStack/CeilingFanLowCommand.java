package com.wight.command.undoStack;


import java.util.LinkedList;

/**
 * @author wight
 * @date 2021/11/13
 * @apiNote
 */
public class CeilingFanLowCommand implements Command {
    CeilingFan ceilingFan;
    final LinkedList<Integer> speedStack;

    public CeilingFanLowCommand(CeilingFan ceilingFan, LinkedList<Integer> speedStack) {
        this.ceilingFan = ceilingFan;
        this.speedStack = speedStack;
    }

    @Override
    public void execute() {
        speedStack.addLast(ceilingFan.getSpeed());
        ceilingFan.low();
    }

    @Override
    public void undo() {
        if (speedStack.isEmpty()) {
            ceilingFan.off();
            return;
        }
        Integer prevSpeed = speedStack.removeLast();
        if (prevSpeed == CeilingFan.HIGH) {
            ceilingFan.high();
        } else if (prevSpeed == CeilingFan.MEDIUM) {
            ceilingFan.medium();
        } else if (prevSpeed == CeilingFan.LOW) {
            ceilingFan.low();
        } else if (prevSpeed == CeilingFan.OFF) {
            ceilingFan.off();
        }
    }
}