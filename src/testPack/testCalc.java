package testPackMain;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import packMain.Calc;

public class testCalc {

	
	Integer a=0;
	Integer b=0;
	Integer expResult=0;
	Integer result;
	
	
	@Before
	public void setUp() throws Exception {
		a=10;
		b=2;
	}

	@Test
	public void testDivide() {
		expResult=5;
		result=Calc.divide(a,b);
		assertEquals(expResult, result);
		//fail("Not yet implemented");
	}
	
	@Test(expected = ArithmeticException.class)
	public void testDivideNull() {
		expResult=5;
		b=0;
		result=Calc.divide(a,b);
		assertEquals(expResult, result);
		//fail("Not yet implemented");
	}

	@Test
	public void testMultiply() {
		expResult=20;
		result=Calc.multiply(a,b);
		assertEquals(expResult, result);
		//fail("Not yet implemented");
	}

	@Test
	public void testMin() {
		expResult=8;
		result=Calc.min(a,b);
		assertEquals(expResult, result);
		//fail("Not yet implemented");
	}

	@Test
	public void testSum() {
		expResult=12;
		result=Calc.sum(a,b);
		assertEquals(expResult, result);
		//fail("Not yet implemented");
	}

}
