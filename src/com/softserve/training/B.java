package com.softserve.training;

public class B extends A {
	
	//private void m1() {  // ERROR
	public void m1() {
		System.out.println("B m1()");
	}

	public void m2() {
		m1();
	}
}
