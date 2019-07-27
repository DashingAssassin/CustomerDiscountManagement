package com.customer.service;

import java.math.BigDecimal;
import java.util.List;

import com.customer.factory.DiscountFactory;
import com.customer.model.Billing;
import com.customer.model.Customer;
import com.customer.model.Discount;

public class CustomerImpl implements CustomerService {

	@Override
	public Customer getCustomerById(int id) {
		return null;
	}

	@Override
	public BigDecimal calculateBillAmount(Billing billing) {
		return processDiscount(billing);
	}

	private BigDecimal processDiscount(Billing billing) {
		Discount discount = DiscountFactory.getDiscountInstace(billing.getCustomer());
		return discount.applyDiscount(billing.getPurchaseAmount());
	}

}
