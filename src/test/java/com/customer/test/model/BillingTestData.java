package com.customer.test.model;

import java.math.BigDecimal;

import com.customer.model.Billing;
import com.customer.model.Customer;

public class BillingTestData {

	public static Billing getBillingWithPremiumCustomerHavingAmountGreaterThan16000() {
		Billing billing = new Billing();
		billing.setCustomer(CustomerTestData.getPremiumCustomer());
		billing.setPurchaseAmount(BigDecimal.valueOf(17000));
		return billing;
	}

	public static Billing getBillingWithPremiumCustomerHavingAmountEquals16000() {
		Billing billing = new Billing();
		billing.setCustomer(CustomerTestData.getPremiumCustomer());
		billing.setPurchaseAmount(BigDecimal.valueOf(16000));
		return billing;
	}

	public static Billing getBillingWithPremiumCustomerHavingAmountLessThan16000AndGreaterThan12000() {
		Billing billing = new Billing();
		billing.setCustomer(CustomerTestData.getPremiumCustomer());
		billing.setPurchaseAmount(BigDecimal.valueOf(15000));
		return billing;
	}

	public static Billing getBillingWithPremiumCustomerHavingAMountEquals12000() {
		Billing billing = new Billing();
		billing.setCustomer(CustomerTestData.getPremiumCustomer());
		billing.setPurchaseAmount(BigDecimal.valueOf(12000));
		return billing;
	}

	public static Billing getBillingWithPremiumCustomerHavingAmountsLessThan12000ANdGreaterThan8000() {
		Billing billing = new Billing();
		billing.setCustomer(CustomerTestData.getPremiumCustomer());
		billing.setPurchaseAmount(BigDecimal.valueOf(9000));
		return billing;
	}

	public static Billing getBillingWithPremiumCustomerHavingAmountsEquals8000() {
		Billing billing = new Billing();
		billing.setCustomer(CustomerTestData.getPremiumCustomer());
		billing.setPurchaseAmount(BigDecimal.valueOf(8000));
		return billing;
	}

	public static Billing getBillingWithPremiumCustomerHavingAmountsLessThan8000AndGreaterThan4000() {
		Billing billing = new Billing();
		billing.setCustomer(CustomerTestData.getPremiumCustomer());
		billing.setPurchaseAmount(BigDecimal.valueOf(7000));
		return billing;
	}

	public static Billing getBillingWithPremiumCustomerHavingAmountsEquals4000() {
		Billing billing = new Billing();
		billing.setCustomer(CustomerTestData.getPremiumCustomer());
		billing.setPurchaseAmount(BigDecimal.valueOf(4000));
		return billing;
	}

	public static Billing getBillingWithPremiumCustomerHavingAmountsLessThan4000() {
		Billing billing = new Billing();
		billing.setCustomer(CustomerTestData.getPremiumCustomer());
		billing.setPurchaseAmount(BigDecimal.valueOf(3000));
		return billing;
	}

	public static Billing getBillingWithRegularCustomerHavingAmountsGreaterThan10000() {
		Billing billing = new Billing();
		billing.setCustomer(CustomerTestData.getRegularCustomer());
		billing.setPurchaseAmount(BigDecimal.valueOf(15000));
		return billing;
	}

	public static Billing getBillingWithRegularCustomerHavingAmountsEquals10000() {
		Billing billing = new Billing();
		billing.setCustomer(CustomerTestData.getRegularCustomer());
		billing.setPurchaseAmount(BigDecimal.valueOf(10000));
		return billing;
	}

	public static Billing getBillingWithRegularCustomerHavingAmountsLessThan10000ButGreaterThan5000() {
		Billing billing = new Billing();
		billing.setCustomer(CustomerTestData.getRegularCustomer());
		billing.setPurchaseAmount(BigDecimal.valueOf(8000));
		return billing;
	}

	public static Billing getBillingWithRegularCustomerHavingAmountsEquals5000() {
		Billing billing = new Billing();
		billing.setCustomer(CustomerTestData.getRegularCustomer());
		billing.setPurchaseAmount(BigDecimal.valueOf(5000));
		return billing;
	}

	public static Billing getBillingWithRegularCustomerHavingAmountsLessThan5000ButGreaterThan0() {
		Billing billing = new Billing();
		billing.setCustomer(CustomerTestData.getRegularCustomer());
		billing.setPurchaseAmount(BigDecimal.valueOf(3000));
		return billing;
	}

}
