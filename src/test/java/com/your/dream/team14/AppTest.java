package com.your.dream.team14;

import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {
	private final String SILVER = "Silver";
	private final String GOLD = "Gold";
	
	User u = new User(SILVER, 1000, 1);
	User u1 = new User(SILVER, 1000, 3);
	User u2 = new User(SILVER, 1000, 5);
	User u3 = new User(SILVER, 500, 1);
	User u4 = new User(SILVER, 1000, 1);
	User u5 = new User(SILVER, 1500, 1);
	User u6 = new User(SILVER, 1500, 5);
	User u7 = new User(SILVER, 500, 0);
	User u8 = new User(SILVER, 1000, 0);
	User u9 = new User(SILVER, 1500, 0);

	// GOLD START
	User u10 = new User(GOLD, 1000, 1);
	User u11 = new User(GOLD, 1000, 3);
	User u12 = new User(GOLD, 1000, 5);
	User u13 = new User(GOLD, 500, 1);
	User u14 = new User(GOLD, 1000, 1);
	User u15 = new User(GOLD, 1500, 1);
	User u16 = new User(GOLD, 1500, 5);
	User u17 = new User(GOLD, 500, 0);
	User u18 = new User(GOLD, 1000, 0);
	User u19 = new User(GOLD, 1500, 0);

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

	// GOLD START

	@Test
	public void getUserTotalChargeTestLine1Gold() {
		float total = u10.getUserTotalCharge();
		assertEquals(49.95, total, 1);
	}

	@Test
	public void getUserTotalChargeTestLine3Gold() {
		float total = u11.getUserTotalCharge();
		assertEquals(78.94, total, 1);
	}

	@Test
	public void getUserTotalChargeTestLine5Gold() {
		float total = u12.getUserTotalCharge();
		assertEquals(83.94, total, 1);
	}

	@Test
	public void getUserTotalChargeTestTime500Gold() {
		float total = u13.getUserTotalCharge();
		assertEquals(49.95, total, 1);
	}

	@Test
	public void getUserTotalChargeTestTime1000Gold() {
		float total = u14.getUserTotalCharge();
		assertEquals(49.95, total, 1);
	}

	@Test
	public void getUserTotalChargeTestTime1500Gold() {
		float total = u15.getUserTotalCharge();
		assertEquals(274.95, total, 1);
	}

	@Test
	public void getUserTotalChargeTestDoubleOverGold() {
		float total = u16.getUserTotalCharge();
		assertEquals(308.95, total, 1);
	}

	@Test
	public void getUserTotalChargeTestLine0Time500Gold() {
		float total = u17.getUserTotalCharge();
		assertEquals(35.45, total, 1);
	}

	@Test
	public void getUserTotalChargeTestLine0TIme1000Gold() {
		float total = u18.getUserTotalCharge();
		assertEquals(35.45, total, 1);
	}

	@Test
	public void getUserTotalChargeTestLine0Time1500Gold() {
		float total = u19.getUserTotalCharge();
		assertEquals(260.45, total, 1);
	}
}