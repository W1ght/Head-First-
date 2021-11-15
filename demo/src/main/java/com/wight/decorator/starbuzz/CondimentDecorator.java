package com.wight.decorator.starbuzz;


/**
 * @author wight
 * @date 2021/11/15
 * @apiNote
 */
public abstract class CondimentDecorator extends Beverage{
    /**
     * 获取描述
     * @return 描述
     */
    @Override
    public abstract String getDescription();
}
