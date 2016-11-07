package com.softserve.train;

public class Appl {
	public static void main(String[] args) {
//		ACar carX6 = new BmwX6();
//		ACar carX6mod = new BmwX6mod();
		BmwX6 carX6mod2 = new BmwX6mod();
//		carX6.carRides();
		//carX6.lightsShine(); // ERROR
//		((BmwX6) carX6).lightsShine();
//		carX6mod.carRides();
//		((BmwX6) carX6mod).lightsShine();
		carX6mod2.carRides();
		carX6mod2.lightsShine();
	}
}
