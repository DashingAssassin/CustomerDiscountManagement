package com.customer.model;

import java.math.BigDecimal;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

import org.springframework.util.CollectionUtils;

public class Discount {

	private final Map<BigDecimal, Double> discountMap;

	public Discount(Map<BigDecimal, Double> discountMap) {
		this.discountMap = discountMap;
	}

	@Override
	public int hashCode() {
		return Objects.hash(discountMap);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof Discount))
			return false;
		Discount other = (Discount) obj;
		return Objects.equals(discountMap, other.discountMap);
	}

	public BigDecimal applyDiscount(BigDecimal amount) {
		if (!CollectionUtils.isEmpty(discountMap)) {
			BigDecimal discount = BigDecimal.ZERO;
			Set<BigDecimal> keySet = discountMap.keySet();
			return processDiscount(discount, keySet, amount);
		}
		return BigDecimal.ZERO;
	}

	private boolean process(BigDecimal bigDecimal, BigDecimal amount) {
		return amount.compareTo(bigDecimal) > 0;
	}

	private BigDecimal processDiscount(BigDecimal discount, Set<BigDecimal> keySet, BigDecimal amount) {
		for (BigDecimal bigDecimal : keySet) {
			if (process(bigDecimal, amount)) {
				BigDecimal bg = amount.subtract(bigDecimal);
				discount = discount.add(bg.multiply(BigDecimal.valueOf(discountMap.get(bigDecimal))));
				amount = amount.subtract(bg);
			}
		}
		return discount;

	}

	@Override
	public String toString() {
		return "Discount [discountMap=" + discountMap + "]";
	}

}
