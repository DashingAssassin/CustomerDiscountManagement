package com.customer.model;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonAutoDetect
public class Customer {

	@JsonIgnore
	private int id;

	@JsonProperty("name")
	private String name;

	@JsonProperty("customerType")
	private CustomerType customerType;

	public Customer(String name, CustomerType customerType) {
		super();
		this.name = name;
		this.customerType = customerType;
	}

	public Customer(int id, String name, CustomerType customerType) {
		super();
		this.id = id;
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

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

}
