package com.customer.service;

import java.math.BigDecimal;

import org.springframework.stereotype.Service;

import com.customer.model.Billing;
import com.customer.model.Customer;

@Service
public interface CustomerService {
	public Customer getCustomerById(int id);
	public BigDecimal calculateBillAmount(Billing billing);
}
