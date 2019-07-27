package com.customer.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CustomerControllerSpringTest {

	@InjectMocks
	private CustomerController customerController;

	@Test
	public void test_discountonpurchasingamount_whenPurchasingAmount18000_onPremiumCustomer() {
	}
	

}
