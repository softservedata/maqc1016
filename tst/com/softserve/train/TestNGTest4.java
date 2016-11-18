package com.softserve.train;

import org.testng.annotations.Test;

public class TestNGTest4 {
	
	@Test(timeOut = 1000)
	public void infinity() {
		long t0 = System.currentTimeMillis();
		long t1 = System.currentTimeMillis();
		long t2;
		while (true) {
			t2 = System.currentTimeMillis();
			if (t2-t1 > 50) {
				System.out.println("time " + (t2-t0) );
				t1 = t2;
			}
		}
			
	}
}
