package com.customer.service;

import java.math.BigDecimal;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

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
		Assert.assertEquals(billing.getPurchaseAmount().subtract(BigDecimal.valueOf(3300.0)), discount);
	}

	@Test
	public void test_discountonpurchasingamount_whenPurchasingAmountEquals16000_onPremiumCustomer() {
		Billing billing = BillingTestData.getBillingWithPremiumCustomerHavingAmountEquals16000();
		BigDecimal discount = customerService.calculateBillAmount(billing);
		Assert.assertNotNull(discount);
		Assert.assertEquals(billing.getPurchaseAmount().subtract(BigDecimal.valueOf(3000.0)), discount);
	}

	@Test
	public void test_discountonpurchasingamount_whenPurchasingAmountLessThan16000AndGraterTan12000_onPremiumCustomer() {
		Billing billing = BillingTestData.getBillingWithPremiumCustomerHavingAmountLessThan16000AndGreaterThan12000();
		BigDecimal discount = customerService.calculateBillAmount(billing);
		Assert.assertNotNull(discount);
		Assert.assertEquals(billing.getPurchaseAmount().subtract(BigDecimal.valueOf(2700.0)), discount);

	}

	@Test
	public void test_discountonpurchasingamount_whenPurchasingEquals12000_onPremiumCustomer() {
		Billing billing = BillingTestData.getBillingWithPremiumCustomerHavingAMountEquals12000();
		BigDecimal discount = customerService.calculateBillAmount(billing);
		Assert.assertNotNull(discount);
		Assert.assertEquals(billing.getPurchaseAmount().subtract(BigDecimal.valueOf(1800.0)), discount);

	}

	@Test
	public void test_discountonpurchasingamount_whenPurchasingLessThan12000GreaterThan8000_onPremiumCustomer() {
		Billing billing = BillingTestData.getBillingWithPremiumCustomerHavingAmountsLessThan12000ANdGreaterThan8000();
		BigDecimal discount = customerService.calculateBillAmount(billing);
		Assert.assertNotNull(discount);
		Assert.assertEquals(billing.getPurchaseAmount().subtract(BigDecimal.valueOf(1200.0)), discount);

	}

	@Test
	public void test_discountonpurchasingamount_whenPurchasingEquals8000_onPremiumCustomer() {
		Billing billing = BillingTestData.getBillingWithPremiumCustomerHavingAmountsEquals8000();
		BigDecimal discount = customerService.calculateBillAmount(billing);
		Assert.assertNotNull(discount);
		Assert.assertEquals(billing.getPurchaseAmount().subtract(BigDecimal.valueOf(1000.0)), discount);

	}

	@Test
	public void test_discountonpurchasingamount_whenPurchasingLessThan8000GreaterThan4000__onPremiumCustomer() {
		Billing billing = BillingTestData.getBillingWithPremiumCustomerHavingAmountsLessThan8000AndGreaterThan4000();
		BigDecimal discount = customerService.calculateBillAmount(billing);
		Assert.assertNotNull(discount);
		Assert.assertEquals(billing.getPurchaseAmount().subtract(BigDecimal.valueOf(850.0)), discount);

	}

	@Test
	public void test_discountonpurchasingamount_whenPurchasingEquals4000_onPremiumCustomer() {
		Billing billing = BillingTestData.getBillingWithPremiumCustomerHavingAmountsEquals4000();
		BigDecimal discount = customerService.calculateBillAmount(billing);
		Assert.assertNotNull(discount);
		Assert.assertEquals(billing.getPurchaseAmount().subtract(BigDecimal.valueOf(400.0)), discount);

	}

	@Test
	public void test_discountonpurchasingamount_whenPurchasingLessThan4000GreaterThan0_onPremiumCustomer() {
		Billing billing = BillingTestData.getBillingWithPremiumCustomerHavingAmountsLessThan4000();
		BigDecimal discount = customerService.calculateBillAmount(billing);
		Assert.assertNotNull(discount);
		Assert.assertEquals(billing.getPurchaseAmount().subtract(BigDecimal.valueOf(300.0)), discount);
	}

	@Test
	public void test_discountonpurchasingamount_whenPurchasingAmountGreaterThan10000_onRegularCustomer() {
		Billing billing = BillingTestData.getBillingWithRegularCustomerHavingAmountsGreaterThan10000();
		BigDecimal discount = customerService.calculateBillAmount(billing);
		Assert.assertNotNull(discount);
		Assert.assertEquals(billing.getPurchaseAmount().subtract(BigDecimal.valueOf(1500.0)), discount);
	}

	@Test
	public void test_discountonpurchasingamount_whenPurchasingAmountEquals10000_onRegularCustomer() {
		Billing billing = BillingTestData.getBillingWithRegularCustomerHavingAmountsEquals10000();
		BigDecimal discount = customerService.calculateBillAmount(billing);
		Assert.assertNotNull(discount);
		Assert.assertEquals(billing.getPurchaseAmount().subtract(BigDecimal.valueOf(500.0)), discount);
	}

	@Test
	public void test_discountonpurchasingamount_whenPurchasingAmountLessThan10000AndGreaterThan5000_onRegularCustomer() {
		Billing billing = BillingTestData.getBillingWithRegularCustomerHavingAmountsLessThan10000ButGreaterThan5000();
		BigDecimal discount = customerService.calculateBillAmount(billing);
		Assert.assertNotNull(discount);
		Assert.assertEquals(billing.getPurchaseAmount().subtract(BigDecimal.valueOf(300.0)), discount);
	}

	@Test
	public void test_discountonpurchasingamount_whenPurchasingAmountEquals5000_onRegularCustomer() {
		Billing billing = BillingTestData.getBillingWithRegularCustomerHavingAmountsEquals5000();
		BigDecimal discount = customerService.calculateBillAmount(billing);
		Assert.assertNotNull(discount);
		Assert.assertEquals(billing.getPurchaseAmount().subtract(BigDecimal.valueOf(0.0)), discount);
	}

	@Test
	public void test_discountonpurchasingamount_whenPurchasingAmountLessThan5000_onRegularCustomer() {
		Billing billing = BillingTestData.getBillingWithRegularCustomerHavingAmountsLessThan5000ButGreaterThan0();
		BigDecimal discount = customerService.calculateBillAmount(billing);
		Assert.assertNotNull(discount);
		Assert.assertEquals(billing.getPurchaseAmount().subtract(BigDecimal.valueOf(0.0)), discount);
	}

}
