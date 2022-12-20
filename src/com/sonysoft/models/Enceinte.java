package com.sonysoft.models;

public class Enceinte<T> {

	private T embryon;

	public Enceinte() {
	}

	public Enceinte(T embryon) {
		this.embryon = embryon;
	}

	public T getEmbryon() {
		return embryon;
	}

	public void setEmbryon(T embryon) {
		this.embryon = embryon;
	}

	@Override
	public String toString() {
		return "Enceinte [ " + embryon + " ]";
	}

}
