package com.softserve.arr;

public class Box2<T> {
	// T stands for "Type".
	private T t;

	public void set(T t) {
		this.t = t;
	}

	public T get() {
		return t;
	}
}
