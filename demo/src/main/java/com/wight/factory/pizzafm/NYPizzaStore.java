package com.wight.factory.pizzafm;
/**
 * @author wight
 * @date 2021/11/16
 * @apiNote
 */
public class NYPizzaStore extends PizzaStore {

	@Override
    Pizza createPizza(String item) {
		switch (item) {
			case "cheese":
				return new NYStyleCheesePizza();
			case "veggie":
				return new NYStyleVeggiePizza();
			case "clam":
				return new NYStyleClamPizza();
			case "pepperoni":
				return new NYStylePepperoniPizza();
			default:
				return null;
		}
	}
}
