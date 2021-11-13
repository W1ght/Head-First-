package com.wight.command.undo;

/**
 * @author wight
 * @date 2021/11/13
 * @apiNote
 */
public class LightOffCommand implements Command{
    Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
    }

    @Override
    public void undo() {
        light.on();
    }
}
