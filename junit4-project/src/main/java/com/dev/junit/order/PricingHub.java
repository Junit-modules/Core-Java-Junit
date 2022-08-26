package com.dev.junit.order;

public interface PricingHub {

	public Long applyDiscount(Long amount);
	public Long applyTax(Long amount);
}
