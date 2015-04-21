package com.fdmgroup.hmrcTDD;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;
import junit.framework.TestCase;

public class CheckoutTest extends TestCase {
	
	private Checkout checkout = new Checkout();
	
	@Before
	public void setup(){
	}
	
	@Test
	public void testCalculateFunctionReturnsSixtyPenceWhenAStringWithTheValueAppleIsPassedIn(){
		// arrange
		ArrayList<String> shopping = new ArrayList<String>();
		String apple = "apple";
		shopping.add(apple);
		// act
		double value = checkout.calculate(shopping);
		// assert
		assertEquals(0.60, value, 0.0);
	}
	
	@Test
	public void testCalculateFunctionReturnsTwentyFivePenceWhenAStringWithTheValueOrangeIsPassedIn(){
		// arrange
		ArrayList<String> shopping = new ArrayList<String>();
		String orange  = "orange";
		shopping.add(orange);
		// act
		double value = checkout.calculate(shopping);
		// assert
		assertEquals(0.25, value, 0.01);
	}
	
	@Test
	public void testCalculateFunctionReturnsEightyFivePenceWhenStringsWithValuesOrangeAndAppleIsPassedIn(){
		// arrange
		ArrayList<String> shopping = new ArrayList<String>();
		String orange  = "orange";
		shopping.add(orange);
		String apple = "apple";
		shopping.add(apple);
		// act
		double value = checkout.calculate(shopping);
		// assert
		assertEquals(0.85, value, 0.01);
	}
	
	@Test
	public void testCalculateFunctionReturnsOneFourtyFiveWhenThreeApplesAndAnOrangeArePassedIn(){
		// arrange
		ArrayList<String> shopping = new ArrayList<String>();
		String orange  = "orange";
		String apple = "apple";
		shopping.add(apple);
		shopping.add(orange);
		shopping.add(apple);
		shopping.add(apple);
		// act
		double value = checkout.calculate(shopping);
		// assert
		assertEquals(1.45, value, 0.01);
	}
	
	@Test
	public void testCalulateFunctionRemovesSixtyPenceFromToatalAndReturnsAPriceOfFiftyPenceWhen3ApplesAreAddedToNowReflectBuyOneGetOneFreeOnApples(){
		// arrange
		ArrayList<String> shopping = new ArrayList<String>();
		String apple = "apple";
		shopping.add(apple);
		shopping.add(apple);
		shopping.add(apple);
		// act
		double value = checkout.calculate(shopping);
		// assert
		assertEquals(1.2, value, 0.01);
	}
	
	@Test
	public void testCalculateFunctionRemovesThePriceOfEveryThirdOrangeInLineWithTheOffer(){
		// arrange
		ArrayList<String> shopping = new ArrayList<String>();
		String orange  = "orange";
		shopping.add(orange);
		shopping.add(orange);
		shopping.add(orange);
		// act
		double value = checkout.calculate(shopping);
		// assert
		assertEquals(0.5, value, 0.01);
	}
	
	@Test
	public void testCalculateFunctionReturnsAPriceOfOneEightyWhenFiveApplesArePassedIn(){
		// arrange
		ArrayList<String> shopping = new ArrayList<String>();
		String apple = "apple";
		shopping.add(apple);
		shopping.add(apple);
		shopping.add(apple);
		shopping.add(apple);
		shopping.add(apple);		
		// act
		double value = checkout.calculate(shopping);
		// assert
		assertEquals(1.8, value, 0.01);
	}
}
