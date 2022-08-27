package com.dev.junit.order;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InOrder;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(value = MockitoJUnitRunner.class)
public class PrincingSimulatorTest {

	@InjectMocks
	PrincingSimulator princingSimulator;
	
	@Mock
	PricingHub pricingHub;
	
	@Test
	public void test() {
		//Given
		when(pricingHub.applyDiscount(100l)).thenReturn(90l);
		when(pricingHub.applyTax(90l)).thenReturn(80l);
		
		//When
		Long actualFinalAmount = princingSimulator.applyPrincings(100l);
		
		//Then
		assertEquals(80, actualFinalAmount.longValue());
		InOrder inOrder = Mockito.inOrder(pricingHub);
		//Will Pass
		inOrder.verify(pricingHub).applyDiscount(100l);
		inOrder.verify(pricingHub).applyTax(90l);
		
		//Will Fail
		//inOrder.verify(pricingHub).applyTax(90l);
		//inOrder.verify(pricingHub).applyDiscount(100l);
	}

}
