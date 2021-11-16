package com.wight.factory.pizzafm;

import java.util.ArrayList;
/**
 * @author wight
 * @date 2021/11/16
 * @apiNote
 */
public abstract class Pizza {
	String name;
	String dough;
	String sauce;
	ArrayList<String> toppings = new ArrayList<>();
 
	void prepare() {
		System.out.println("Preparing " + name);
		System.out.println("Tossing dough...");
		System.out.println("Adding sauce...");
		System.out.println("Adding toppings: ");
		for (Object topping : toppings) {
			System.out.println("   " + topping);
		}
	}
  
	void bake() {
		System.out.println("Bake for 25 minutes at 350");
	}
 
	void cut() {
		System.out.println("Cutting the pizza into diagonal slices");
	}
  
	void box() {
		System.out.println("Place pizza in official PizzaStore box");
	}
 
	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		StringBuilder display = new StringBuilder();
		display.append("---- ").append(name).append(" ----\n");
		display.append(dough).append("\n");
		display.append(sauce).append("\n");
		for (Object topping : toppings) {
			display.append((String) topping).append("\n");
		}
		return display.toString();
	}
}