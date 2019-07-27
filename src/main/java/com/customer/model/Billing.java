package com.customer.model;

import java.math.BigDecimal;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

@JsonAutoDetect
public class Billing {

	private Customer customer; // customer Type

	private BigDecimal purchaseAmount;

	public Billing(Customer customer, BigDecimal purchaseAmount) {
		super();
		this.customer = customer;
		this.purchaseAmount = purchaseAmount;
	}

	public Billing() {
		super();
	}

	/**
	 * @return the customer
	 */
	public Customer getCustomer() {
		return customer;
	}

	/**
	 * @param customer the customer to set
	 */
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	/**
	 * @return the purchaseAmount
	 */
	public BigDecimal getPurchaseAmount() {
		return purchaseAmount;
	}

	/**
	 * @param purchaseAmount the purchaseAmount to set
	 */
	public void setPurchaseAmount(BigDecimal purchaseAmount) {
		this.purchaseAmount = purchaseAmount;
	}

	@Override
	public int hashCode() {
		return Objects.hash(customer, purchaseAmount);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof Billing))
			return false;
		Billing other = (Billing) obj;
		return Objects.equals(customer, other.customer) && Objects.equals(purchaseAmount, other.purchaseAmount);
	}

}
