package edu.csbsju.ntc;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class NewTelephoneCompanyTest_WBT {
	private int startTime;
	private int duration;
	private static final double FED_TAX = 0.04;
	private static final double COST = 40;
	private static final double HOURS_DISCOUNT = 0.5;
	private static final double DURATION_DISCOUNT = 0.15;
	
	  private NewTelephoneCompany ntc;
	  
	  @Before
	  public void setUp() throws Exception {
	    ntc = new NewTelephoneCompany();
	  }
	  
	@Test //expects UnsupportedOperationException
	public void testFailsInvalidStartTime() {
		int expStart = -5;
		int expDuration = 10;
		ntc.setStartTime(expStart);
	    int result = ntc.getStartTime();
	    assertEquals("Start time " + expStart + " was inputted, but it is invalid",expStart, result);
	  }
	
	@Test //expects UnsupportedOperationException
	public void testFailsInvalidDuration() {
		int expStart = 1800;
		int expDuration = 10;
		ntc.setDuration(expStart);
	    int result = ntc.getDuration();
	    assertEquals("Duration " + expStart + " was inputted, but it is invalid",expStart, result);
	  }
	
	@Test
	public void testDiscStartimeAndDuration() {
		int expStart = 500;
		int expDuration = 100;
		ntc.setStartTime(expStart);
		ntc.setDuration(expDuration);
	    int result = ntc.getStartTime();
	    int result2 = ntc.getStartTime();
	    assertEquals("Start time is " + expStart,expStart, result);
	    assertEquals("Duration is " + expDuration,expDuration, result2);

	  }
	
	@Test
	public void testDiscStarttime() {
		int expStart = 0;
		int expDuration = 60;
		ntc.setStartTime(expStart);
	    int result = ntc.getStartTime();
	    assertEquals("Hours is " + expStart,expStart, result);
	  }
	
	@Test
	public void testDiscDuration() {
		int expStart = 800;
		int expDuration = 65;
		ntc.setDuration(expDuration);
	    int result = ntc.getStartTime();
	    assertEquals("Duration is " + expDuration,expDuration, result);
	  }
	
	@Test
	public void testNoDiscounts() {
		int expStart = 1000;
		int expDuration = 40;
		ntc.setStartTime(expStart);
		ntc.setDuration(expDuration);
	    int result = ntc.getStartTime();
	    int result2 = ntc.getDuration();
	    assertEquals("Start time is " + expStart,expStart, result);
	    assertEquals("Duration is " + expDuration,expDuration, result2);

	}
}