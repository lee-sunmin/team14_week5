package com.your.dream.team14;

import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {
	private static final String sv = "Silver";
	private static final String gd = "Gold";
	
	User u = new User(sv, 1000, 1);
	User u1 = new User(sv, 1000, 3);
	User u2 = new User(sv, 1000, 5);
	User u3 = new User(sv, 500, 1);
	User u4 = new User(sv, 1000, 1);
	User u5 = new User(sv, 1500, 1);
	User u6 = new User(sv, 1500, 5);
	User u7 = new User(sv, 500, 0);
	User u8 = new User(sv, 1000, 0);
	User u9 = new User(sv, 1500, 0);

	User u10 = new User(gd, 1000, 1);
	User u11 = new User(gd, 1000, 3);
	User u12 = new User(gd, 1000, 5);
	User u13 = new User(gd, 500, 1);
	User u14 = new User(gd, 1000, 1);
	User u15 = new User(gd, 1500, 1);
	User u16 = new User(gd, 1500, 5);
	User u17 = new User(gd, 500, 0);
	User u18 = new User(gd, 1000, 0);
	User u19 = new User(gd, 1500, 0);

	@Test
	public void getUserTotalChargeTestLine1() {
		float total = u.getUserTotalCharge();
		assertEquals(299.95, total, 1);
	}

	@Test
	public void getUserTotalChargeTestLine3() {
		float total = u1.getUserTotalCharge();
		assertEquals(342.95, total, 1);
	}

	@Test
	public void getUserTotalChargeTestLine5() {
		float total = u2.getUserTotalCharge();
		assertEquals(347.95, total, 1);
	}

	@Test
	public void getUserTotalChargeTestTime500() {
		float total = u3.getUserTotalCharge();
		assertEquals(29.95, total, 1);
	}

	@Test
	public void getUserTotalChargeTestTime1000() {
		float total = u4.getUserTotalCharge();
		assertEquals(299.95, total, 1);
	}

	@Test
	public void getUserTotalChargeTestTime1500() {
		float total = u5.getUserTotalCharge();
		assertEquals(569.95, total, 1);
	}

	@Test
	public void getUserTotalChargeTestDoubleOver() {
		float total = u6.getUserTotalCharge();
		assertEquals(617.95, total, 1);
	}

	@Test
	public void getUserTotalChargeTestLine0Time500() {
		float total = u7.getUserTotalCharge();
		assertEquals(8.44, total, 1);
	}

	@Test
	public void getUserTotalChargeTestLine0Time1000() {
		float total = u8.getUserTotalCharge();
		assertEquals(278.45, total, 1);
	}

	@Test
	public void getUserTotalChargeTestLine0Time1500() {
		float total = u9.getUserTotalCharge();
		assertEquals(548.45, total, 1);
	}

	@Test
	public void getUserTotalChargeTestLine1gd() {
		float total = u10.getUserTotalCharge();
		assertEquals(49.95, total, 1);
	}

	@Test
	public void getUserTotalChargeTestLine3gd() {
		float total = u11.getUserTotalCharge();
		assertEquals(78.94, total, 1);
	}

	@Test
	public void getUserTotalChargeTestLine5gd() {
		float total = u12.getUserTotalCharge();
		assertEquals(83.94, total, 1);
	}

	@Test
	public void getUserTotalChargeTestTime500gd() {
		float total = u13.getUserTotalCharge();
		assertEquals(49.95, total, 1);
	}

	@Test
	public void getUserTotalChargeTestTime1000gd() {
		float total = u14.getUserTotalCharge();
		assertEquals(49.95, total, 1);
	}

	@Test
	public void getUserTotalChargeTestTime1500gd() {
		float total = u15.getUserTotalCharge();
		assertEquals(274.95, total, 1);
	}

	@Test
	public void getUserTotalChargeTestDoubleOvergd() {
		float total = u16.getUserTotalCharge();
		assertEquals(308.95, total, 1);
	}

	@Test
	public void getUserTotalChargeTestLine0Time500gd() {
		float total = u17.getUserTotalCharge();
		assertEquals(35.45, total, 1);
	}

	@Test
	public void getUserTotalChargeTestLine0TIme1000gd() {
		float total = u18.getUserTotalCharge();
		assertEquals(35.45, total, 1);
	}

	@Test
	public void getUserTotalChargeTestLine0Time1500gd() {
		float total = u19.getUserTotalCharge();
		assertEquals(260.45, total, 1);
	}
	
	@SuppressWarnings("static-access")
	@Test
	public void MainTestSilver(){
		App appTest;
		appTest = new App();
		String [] inputs = {"Gold","1500","5"};
		appTest.main(inputs);
		
		String [] inputs_2 = {"Silver","1500","5"};
		appTest.main(inputs_2);

	}
	
}