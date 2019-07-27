package com.customer.factory;

import com.customer.model.Customer;
import com.customer.model.CustomerType;
import com.customer.model.Discount;
import com.customer.model.PremiumCustomerDiscount;
import com.customer.model.RegularCustomerDiscount;

/**
 * Factory Design Pattern Implementation along with Singleton Implementation
 * 
 * @author Nikhil
 *
 */
public class DiscountFactory {

	public static Discount getDiscountInstace(Customer customer) {
		if (customer == null)
			return null; // or throw exception
		if (CustomerType.PREMIUM.equals(customer.getCustomerType())) {
			return PremiumCustomerDiscount.getInstance();
		}
		// default regular customer assumption
		return RegularCustomerDiscount.getInstance();
	}

}
