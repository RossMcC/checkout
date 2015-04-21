package com.fdmgroup.hmrcTDD;

import java.util.ArrayList;

public class Checkout {

	public double calculate(ArrayList<String> shopping){
		final double apple = 0.6;
		final double orange = 0.25;
		int apples= 0;
		int oranges = 0;
		double price = 0;
		if(shopping.isEmpty()){
			return 0;
		}
		for(int i = 0; i < shopping.size(); i++){
			if(shopping.get(i).equals("apple")){
				price += apple;
				apples += 1;
				if(apples >= 2){
					price -= apple;
					apples = 0;
				}
			}
			if(shopping.get(i).equals("orange")){
				price += orange;
				oranges += 1;
				if(oranges >= 3){
					price -= orange;
					oranges = 0;
				}
			}
		}

		return price;
	}
}