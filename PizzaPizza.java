package com.advanced.enumcoding;

public class PizzaPizza {

	private static PizzaSize pizzaSize;

	public static void main(String[] args) {
		System.out.println("Available Sizes:");
		for(PizzaSize pizzaSize:pizzaSize.values()) {
			System.out.println("_"+ pizzaSize.name());
		}
		System.out.println();
		Pizza pizzaOrder=new Pizza("rocher", PizzaSize.MEDIUM);
		System.out.println("Name:"+pizzaOrder.getName());
		System.out.println("Size:"+ pizzaOrder.getPizzaSize().name());
		System.out.println("price: "+pizzaOrder.getPrice());

	}

}
