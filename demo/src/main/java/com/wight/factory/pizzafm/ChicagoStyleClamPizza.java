package com.wight.factory.pizzafm;
/**
 * @author wight
 * @date 2021/11/16
 * @apiNote
 */
public class ChicagoStyleClamPizza extends Pizza {
	public ChicagoStyleClamPizza() {
		name = "Chicago Style Clam Pizza";
		dough = "Extra Thick Crust Dough";
		sauce = "Plum Tomato Sauce";
 
		toppings.add("Shredded Mozzarella Cheese");
		toppings.add("Frozen Clams from Chesapeake Bay");
	}
 
	@Override
    void cut() {
		System.out.println("Cutting the pizza into square slices");
	}
}
