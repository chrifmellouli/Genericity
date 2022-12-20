package com.sonysoft.models;

public class Fille {

	private String name;

	public Fille() {
	}

	public Fille(String name) {
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
		return "Fille [name=" + name + "]";
	}

}
