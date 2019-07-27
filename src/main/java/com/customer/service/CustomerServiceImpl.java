package com.customer.service;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.customer.dao.CustomerDAO;
import com.customer.factory.DiscountFactory;
import com.customer.model.Billing;
import com.customer.model.Customer;
import com.customer.model.Discount;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	protected CustomerDAO customerDAO;

	@Override
	public Customer getCustomerById(int id) {
		return this.customerDAO.getCustomerById(id);
	}

	@Override
	public BigDecimal calculateBillAmount(Billing billing) {
		return processDiscount(billing);
	}

	private BigDecimal processDiscount(Billing billing) {
		Discount discount = DiscountFactory.getDiscountInstace(billing.getCustomer());
		return billing.getPurchaseAmount().subtract(discount.applyDiscount(billing.getPurchaseAmount()));
	}

}
