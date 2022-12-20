package com.sonysoft.models;

public class Chevre {

	private String name;

	public Chevre() {
		super();
	}

	public Chevre(String name) {
		super();
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
		return "Chevre [name=" + name + "]";
	}

}
