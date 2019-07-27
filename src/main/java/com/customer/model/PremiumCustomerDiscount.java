package com.customer.model;

import java.math.BigDecimal;
import java.util.Collections;
import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

import com.customer.model.RegularCustomerDiscount.RegularCustomerDiscountInstace;

public class PremiumCustomerDiscount extends Discount {

	private static PremiumCustomerDiscount instance;

	static class PremiumCustomerInstace {
		public static PremiumCustomerDiscount getInstance() {
			if (instance == null) {
				synchronized (PremiumCustomerDiscount.class) {
					if (instance == null) {
						return new PremiumCustomerDiscount();
					}
				}
			}
			return instance;
		}
	}

	private static final Map<BigDecimal, Double> discountMap;
	static {
		discountMap = new TreeMap<BigDecimal, Double>(Collections.reverseOrder());
		discountMap.put(BigDecimal.valueOf(0), Double.valueOf(10));
		discountMap.put(BigDecimal.valueOf(4000), Double.valueOf(15));
		discountMap.put(BigDecimal.valueOf(8000), Double.valueOf(20));
		discountMap.put(BigDecimal.valueOf(12000), Double.valueOf(30));
	}

	private PremiumCustomerDiscount() {
		super(discountMap);
	}

	public static PremiumCustomerDiscount getInstance() {
		return PremiumCustomerInstace.getInstance();
	}

}
