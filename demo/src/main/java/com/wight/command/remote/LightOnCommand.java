package com.wight.command.remote;

/**
 * @author wight
 * @date 2021/11/13
 * @apiNote
 */
public class LightOnCommand implements Command {
    Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }
}
