package com.wight.factory.pizzafm;
/**
 * @author wight
 * @date 2021/11/16
 * @apiNote
 */
public class NYStyleClamPizza extends Pizza {

	public NYStyleClamPizza() {
		name = "NY Style Clam Pizza";
		dough = "Thin Crust Dough";
		sauce = "Marinara Sauce";
 
		toppings.add("Grated Reggiano Cheese");
		toppings.add("Fresh Clams from Long Island Sound");
	}
}
