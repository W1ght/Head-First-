package com.wight.command.undoStack;

/**
 * @author wight
 * @date 2021/11/13
 * @apiNote
 */
public interface Command {
    /**
     * 执行
     */
    public void execute();

    /**
     * 撤销
     */
    public void undo();
}
