package com.fdmgroup.hmrcTDD;

import java.util.ArrayList;
import static org.junit.Assert.*;

import org.junit.*;

public class CheckoutTest {
	
	private Checkout checkout;
	ArrayList<String> shopping;
	String apple;
	String orange;
	
	@Before
	public void setup(){
		checkout= new Checkout();
		shopping = new ArrayList<String>();
		apple = new String();
		apple = "apple";
		orange  = new String();
		orange = "orange";
	}
	
	@Test
	public void testCalculateFunctionReturnsSixtyPenceWhenAStringWithTheValueAppleIsPassedIn(){
		// arrange
		shopping.add(apple);
		// act
		double value = checkout.calculate(shopping);
		// assert
		assertEquals(0.60, value, 0.0);
	}
	
	@Test
	public void testCalculateFunctionReturnsTwentyFivePenceWhenAStringWithTheValueOrangeIsPassedIn(){
		// arrange
		shopping.add(orange);
		// act
		double value = checkout.calculate(shopping);
		// assert
		assertEquals(0.25, value, 0.01);
	}
	
	@Test
	public void testCalculateFunctionReturnsEightyFivePenceWhenStringsWithValuesOrangeAndAppleIsPassedIn(){
		// arrange
		shopping.add(orange);
		shopping.add(apple);
		// act
		double value = checkout.calculate(shopping);
		// assert
		assertEquals(0.85, value, 0.01);
	}
	
	@Test
	public void testCalculateFunctionReturnsOneFourtyFiveWhenThreeApplesAndAnOrangeArePassedIn(){
		// arrange
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
