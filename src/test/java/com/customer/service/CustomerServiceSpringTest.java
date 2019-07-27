package com.customer.service;

import java.math.BigDecimal;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.customer.controller.CustomerController;
import com.customer.model.Billing;
import com.customer.test.model.BillingTestData;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CustomerServiceSpringTest {

	@InjectMocks
	private CustomerServiceImpl customerService;

	@Test
	public void test_discountonpurchasingamount_whenPurchasingAmount18000_onPremiumCustomer() {
		Billing billing = BillingTestData.getBillingWithPremiumCustomerHavingAmountGreaterThan16000();
		BigDecimal discount = customerService.calculateBillAmount(billing);
		Assert.assertNotNull(discount);
		System.out.println(discount);
	}

	@Test
	public void test_discountonpurchasingamount_whenPurchasingAmountEquals16000_onPremiumCustomer() {
		Billing billing = BillingTestData.getBillingWithPremiumCustomerHavingAmountEquals16000();
		BigDecimal discount = customerService.calculateBillAmount(billing);
		Assert.assertNotNull(discount);
		Assert.assertEquals(BigDecimal.valueOf(3000), discount);
	}

	@Test
	public void test_discountonpurchasingamount_whenPurchasingAmountLessThan16000AndGraterTan12000_onPremiumCustomer() {
		Billing billing = BillingTestData.getBillingWithPremiumCustomerHavingAmountLessThan16000AndGreaterThan12000();
		BigDecimal discount = customerService.calculateBillAmount(billing);
		Assert.assertNotNull(discount);
	}

	@Test
	public void test_discountonpurchasingamount_whenPurchasingEquals12000_onPremiumCustomer() {
		Billing billing = BillingTestData.getBillingWithPremiumCustomerHavingAMountEquals12000();
		BigDecimal discount = customerService.calculateBillAmount(billing);
		Assert.assertNotNull(discount);
		System.out.println(discount);
	}
	
	@Test
	public void test_discountonpurchasingamount_whenPurchasingLessThan12000GreaterThan8000_onPremiumCustomer() {
		Billing billing = BillingTestData.getBillingWithPremiumCustomerHavingAmountsLessThan12000ANdGreaterThan8000();
		BigDecimal discount = customerService.calculateBillAmount(billing);
		Assert.assertNotNull(discount);
		System.out.println(discount);
	}
	
	@Test
	public void test_discountonpurchasingamount_whenPurchasingEquals8000_onPremiumCustomer() {
		Billing billing = BillingTestData.getBillingWithPremiumCustomerHavingAmountsEquals8000()
		BigDecimal discount = customerService.calculateBillAmount(billing);
		Assert.assertNotNull(discount);
		System.out.println(discount);
	}
	
	@Test
	public void test_discountonpurchasingamount_whenPurchasingLessThan8000__onPremiumCustomer() {
		Billing billing = BillingTestData.getBillingWithPremiumCustomerHavingAMountEquals12000();
		BigDecimal discount = customerService.calculateBillAmount(billing);
		Assert.assertNotNull(discount);
		System.out.println(discount);
	}
	
//	@Test
//	public void test_discountonpurchasingamount_whenPurchasingEquals12000_onPremiumCustomer() {
//		Billing billing = BillingTestData.getBillingWithPremiumCustomerHavingAMountEquals12000();
//		BigDecimal discount = customerService.calculateBillAmount(billing);
//		Assert.assertNotNull(discount);
//		System.out.println(discount);
//	}

}