package com.customer.model;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonAutoDetect
public class Customer {

	@JsonProperty("name")
	private String name;

	@JsonProperty("customerType")
	private CustomerType customerType;

	public Customer(String name, CustomerType customerType) {
		super();
		this.name = name;
		this.customerType = customerType;
	}

	public Customer() {
		super();
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the customerType
	 */
	public CustomerType getCustomerType() {
		return customerType;
	}

	/**
	 * @param customerType the customerType to set
	 */
	public void setCustomerType(CustomerType customerType) {
		this.customerType = customerType;
	}

	@Override
	public int hashCode() {
		return Objects.hash(customerType, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof Customer))
			return false;
		Customer other = (Customer) obj;
		return customerType == other.customerType && Objects.equals(name, other.name);
	}

}
