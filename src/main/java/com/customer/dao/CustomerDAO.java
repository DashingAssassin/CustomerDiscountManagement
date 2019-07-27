package com.customer.dao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Component;

import com.customer.model.Customer;
import com.customer.model.CustomerType;

/**
 * This is a component which can be replacedby either database layer connection
 * or repository as pleased
 */
@Component
public class CustomerDAO {

	private static List<Customer> staticCustomerList = new ArrayList<Customer>();
	static List<String> premiumList = Arrays.asList("A", "B", "C", "D", "E");
	static List<String> regularList = Arrays.asList("F", "G", "H", "I", "J");

	static {
		for (int i = 0; i < 5; i++) {
			staticCustomerList.add(new Customer(i, premiumList.get(i), CustomerType.PREMIUM));
		}

		for (int i = 5,j=0;j<5 && i < 10; i++,j++) {
			staticCustomerList.add(new Customer(i, regularList.get(j), CustomerType.REGULAR));
		}
	}

	public Customer getCustomerById(int id) {
		return staticCustomerList.parallelStream().filter((a)->{ return id == a.getId(); }).findFirst().get();
	}

}
