package com.dev.junit.order;

public class PrincingSimulator {

	private PricingHub pricingHub;
	
	public PrincingSimulator(PricingHub pricingHub) {
		this.pricingHub = pricingHub;
	}
	
	public Long applyPrincings(Long amount) {
		Long postDiscount = this.pricingHub.applyDiscount(amount);
		Long postTax = this.pricingHub.applyTax(postDiscount);
		return postTax;
	}
}
