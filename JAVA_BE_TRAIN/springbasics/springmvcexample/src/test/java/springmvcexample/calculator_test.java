package springmvcexample;

import static org.junit.Assert.*;

import org.junit.Test;

import springexample.utility.Calculator;

public class calculator_test {

	@Test
	public void testAdd() {
       Calculator x=new Calculator();
       assertTrue(x.Add(5,5)==10);
	}
	
	@Test
	public void testSub() {
		Calculator y=new Calculator();
		assertTrue(y.Sub(15,4)==10);
	}


}
