package com.customer.model;

public enum CustomerType {
	PREMIUM("Premium"), REGULAR("Regular");
	String value;

	CustomerType(String value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return super.toString();
	}

}
