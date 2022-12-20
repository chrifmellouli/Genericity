package com.sonysoft.models;

public class Bagra {

	private String name;

	public Bagra() {
	}

	public Bagra(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Bagra [name=" + name + "]";
	}

}
