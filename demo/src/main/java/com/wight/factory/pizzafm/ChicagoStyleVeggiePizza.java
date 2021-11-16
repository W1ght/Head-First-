package com.wight.factory.pizzafm;
/**
 * @author wight
 * @date 2021/11/16
 * @apiNote
 */
public class ChicagoStyleVeggiePizza extends Pizza {
	public ChicagoStyleVeggiePizza() {
		name = "Chicago Deep Dish Veggie Pizza";
		dough = "Extra Thick Crust Dough";
		sauce = "Plum Tomato Sauce";
 
		toppings.add("Shredded Mozzarella Cheese");
		toppings.add("Black Olives");
		toppings.add("Spinach");
		toppings.add("Eggplant");
	}
 
	@Override
    void cut() {
		System.out.println("Cutting the pizza into square slices");
	}
}
