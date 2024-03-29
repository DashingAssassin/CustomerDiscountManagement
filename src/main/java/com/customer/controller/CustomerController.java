package com.customer.controller;

import java.math.BigDecimal;

import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.customer.model.Billing;
import com.customer.model.Customer;
import com.customer.service.CustomerService;

@RestController
public class CustomerController {

	@Autowired
	private CustomerService customerService;

	@GetMapping(value = { "/getCustomer/{id}" }, produces = { MediaType.APPLICATION_JSON }, consumes = {
			MediaType.APPLICATION_JSON })
	public Customer getCustomerById(@PathVariable("id") int id) {
		return this.customerService.getCustomerById(id);
	}

	@PostMapping(value = { "/billCustomer" }, produces = { MediaType.APPLICATION_JSON }, consumes = {
			MediaType.APPLICATION_JSON })
	public BigDecimal calculateBillAmount(@RequestBody Billing billing) {
		return this.customerService.calculateBillAmount(billing);
	}

}
