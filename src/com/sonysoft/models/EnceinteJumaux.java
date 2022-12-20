package com.sonysoft.models;

public class EnceinteJumaux<Y, X> {

	private Y embruyon1;
	private X embruyon2;

	public EnceinteJumaux() {
		super();
	}

	public EnceinteJumaux(Y embruyon1, X embruyon2) {
		super();
		this.embruyon1 = embruyon1;
		this.embruyon2 = embruyon2;
	}

	public Y getEmbruyon1() {
		return embruyon1;
	}

	public void setEmbruyon1(Y embruyon1) {
		this.embruyon1 = embruyon1;
	}

	public X getEmbruyon2() {
		return embruyon2;
	}

	public void setEmbruyon2(X embruyon2) {
		this.embruyon2 = embruyon2;
	}

	@Override
	public String toString() {
		return "EnceinteJumaux [ " + embruyon1 + ", et " + embruyon2 + "]";
	}

}
