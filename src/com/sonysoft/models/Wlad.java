package com.sonysoft.models;

public class Wlad {

	private String name;

	public Wlad() {
	}

	public Wlad(String name) {
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
		return "Garcon [name=" + name + "]";
	}

}
