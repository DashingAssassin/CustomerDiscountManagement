package com.customer.model;

import java.math.BigDecimal;
import java.util.Map;
import java.util.TreeMap;

public class RegularCustomerDiscount extends Discount {

	private static RegularCustomerDiscount instance;

	static class RegularCustomerDiscountInstace {
		public static RegularCustomerDiscount getInstance() {
			if (instance == null) {
				synchronized (RegularCustomerDiscount.class) {
					if (instance == null) {
						return new RegularCustomerDiscount();
					}
				}
			}
			return instance;
		}
	}

	private static final Map<BigDecimal, Double> discountMap;
	static {
		discountMap = new TreeMap();
		discountMap.put(BigDecimal.valueOf(4999), Double.valueOf(0));
		discountMap.put(BigDecimal.valueOf(9999), Double.valueOf(10));
		discountMap.put(BigDecimal.valueOf(10000), Double.valueOf(20));
	}

	private RegularCustomerDiscount() {
		super(discountMap);
	}

	public static RegularCustomerDiscount getInstance() {
		return RegularCustomerDiscountInstace.getInstance();
	}

}
