package edu.csbsju.ntc;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class NewTelephoneCompanyTest_WBT {
	private int startTime;
	private int duration;

	
	  private NewTelephoneCompany ntc;
	  
	  @Before
	  public void setUp() throws Exception {
	    ntc = new NewTelephoneCompany();
	  }
	  
	@Test //expects UnsupportedOperationException
	public void testFailsInvalidStartTime() {
		double expResult = -1;
		int start = -5;
		int duration = 10;
		ntc.setStartTime(start);
		ntc.setDuration(duration);
	    double result = ntc.computeCharge();
	    assertEquals("Charge should be " + expResult + " but recieved invalid start time",expResult, result);
	  }
	
	@Test //expects UnsupportedOperationException
	public void testFailsInvalidDuration() {
		double expResult = -1;
		int start = 1800;
		int duration = 10;
		ntc.setStart(start);
		ntc.setDuration(duration);
	    double result = ntc.computeCharge();
	    assertEquals("Charge should be " + expResult + " but recieved invalid duration",expResult, result);
	  }
	
	@Test
	public void testDiscStartimeAndDuration() {
		double expResult = 1768.0;
		int start = 500;
		int duration = 100;
		ntc.setStartTime(start);
		ntc.setDuration(duration);
		double result = ntc.computeCharge();
	    assertEquals("Charge should be " + expResult + " with an discounted start time and duration",expResult, result);

	  }
	
	@Test
	public void testDiscStarttime() {
		double expResult = 1248.0;
		int start = 0;
		int duration = 60;
		ntc.setStartTime(start);
		ntc.setDuration(duration);
	    double result = ntc.computeCharge;
	    assertEquals("Charge should be " + expResult + " with a dicounted start time",expResult, result);
	  }
	
	@Test
	public void testDiscDuration() {
		double expResult = 2298.4
		int start = 800;
		int duration = 65;
		ntc.setDuration(duration);
	    double result = ntc.computeCharge();
	    assertEquals("Charge should be " + expResult + " with a discounted duration",expResult, result);
	  }
	
	@Test
	public void testNoDiscounts() {
		double expResult = 1664.0;
		int start = 1000;
		int expDuration = 40;
		ntc.setStartTime(expStart);
	    double result = ntc.getStartTime();
	    assertEquals("harge should be " + expResult + " with no discounts",expResult, result);

	}
}