package com.wight.factory.pizzafm;
/**
 * @author wight
 * @date 2021/11/16
 * @apiNote
 */
public class ChicagoPizzaStore extends PizzaStore {

	@Override
	Pizza createPizza(String item) {
		switch (item) {
			case "cheese":
				return new ChicagoStyleCheesePizza();
			case "veggie":
				return new ChicagoStyleVeggiePizza();
			case "clam":
				return new ChicagoStyleClamPizza();
			case "pepperoni":
				return new ChicagoStylePepperoniPizza();
			default:
				return null;
		}
	}
}
