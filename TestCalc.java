package Day_13;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestCalc {

	@Test
	public void testAdd() {
		int a=4,b=6;
		int result=Calc.add(a,b);
		assertEquals(10,result);
	}
	
	
	@Test
	public void testdivide() {
		int a=4,b=2;
		double result=Calc.divide(a,b);
		assertEquals(2.0,result,0.00001);
	}
	@Test
	public void testSub() {
		int a=4,b=6;
		int result=Calc.sub(a,b);
		assertEquals(a-b,result);
	}
	@Test
	public void stngAdd() {
		String a="Aniket",b="Solanki";
		String result=Calc.stringAdd(a,b);
		assertEquals("Aniket So	lanki",result);
	}
	@Test
	public void testFact() {
		int a=5;
		int result=Calc.factorial(a);
		assertEquals(120,result);
	}

}
