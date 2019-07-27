package com.customer.controller;

import java.math.BigDecimal;
import java.util.List;

import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.customer.model.Billing;
import com.customer.model.Customer;
import com.customer.service.CustomerService;

@RestController
public class CustomerController {

	@Autowired
	private CustomerService customerService;

	@GetMapping(value = { "/getAllCustomer" }, produces = { MediaType.APPLICATION_JSON }, consumes = {
			MediaType.APPLICATION_JSON })
	public List<Customer> getAllCustomer() {
		// return this.customerService.getAllCustomer();
		return null;
	}

	@GetMapping(value = { "/billCustomer" }, produces = { MediaType.APPLICATION_JSON }, consumes = {
			MediaType.APPLICATION_JSON })
	public BigDecimal calculateBillAmount(Billing billing) {
		return this.customerService.calculateBillAmount(billing);
	}

}
