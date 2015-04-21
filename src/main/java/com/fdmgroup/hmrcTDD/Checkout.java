package com.fdmgroup.hmrcTDD;

import java.util.ArrayList;

public class Checkout {

	public double calculate(ArrayList<String> shopping){
		final double apple = 0.6;			// price of an apple
		final double orange = 0.25;			// price of an orange
		int apples= 0;						// number of apples scanned
		int oranges = 0; 					// number of oranges scanned
		double price = 0;					// the total price
		if(shopping.isEmpty()){
			return 0;
		}
		for(int i = 0; i < shopping.size(); i++){
			// checks if there is an apple to be processed
			if(shopping.get(i).equals("apple")){
				price += apple;
				apples += 1;
				if(apples >= 2){
					// checks if there is enough apples to merit offer
					price -= apple;
					apples = 0;
				}
			}
			// checks if there is an orange to be processed
			if(shopping.get(i).equals("orange")){
				price += orange;
				oranges += 1;
				if(oranges >= 3){
					// checks if there is enough oranges to merit offer
					price -= orange;
					oranges = 0;
				}
			}
		}

		return price;
	}
}