package test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;


public class CalculatorTest {
	private static Calculator calculator = new Calculator();

	@Before
	public void setUp() throws Exception {
		calculator.clear();
	}

	@After
	public void testDown() throws Exception{
		}
	@Test(timeout = 1000)
	public void testAdd() {
		calculator.add(6);
		calculator.add(3);
		assertEquals(9,calculator.getresult());
	}

	@Test
	public void testSubstract() {
		calculator.add(10);
		calculator.substract(2);
		assertEquals(8,calculator.getresult());
	}
    @Ignore("Multiply() Not yet implemented")
	@Test
	public void testDimultiply() {
	}

	@Test
	public void testDivide() {
		calculator.add(8);
		calculator.divide(0);
		assertEquals(2,calculator.getresult());
	}

}
//
//
//
//
//
//
//
//
//
//
//
//
//