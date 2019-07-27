package com.customer.test.model;

import com.customer.model.Customer;
import com.customer.model.CustomerType;

public class CustomerTestData {

	public static Customer getPremiumCustomer() {
		return new Customer("premium", CustomerType.PREMIUM);
	}

	public static Customer getRegularCustomer() {
		return new Customer("regular", CustomerType.REGULAR);
	}

}
